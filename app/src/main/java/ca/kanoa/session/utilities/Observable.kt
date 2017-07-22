package ca.kanoa.session.utilities

fun <T> lazyObservable(value: () -> T) = Observable.Lazy(value)

class Observable<T>(var value: T) {
    private val subscribers: MutableSet<(T) -> Unit> = mutableSetOf()

    fun get() = value

    fun set(new: T) {
        notifyChange(new)
        value = new
    }

    fun bind(listener: (new: T) -> Unit) = subscribers.add(listener)

    fun unbind(listener: (new: T) -> Unit) = subscribers.remove(listener)

    fun notifyChange(new: T? = null) {
        if (new != null) subscribers.forEach { it.invoke(new) }
        else subscribers.forEach { it.invoke(value) }
    }

    class Lazy<T>(val value: () -> T) {
        private var observable: Observable<T>? = null
        private val subscribers: MutableSet<(T) -> Unit> = mutableSetOf()

        private fun check() {
            if (observable == null) {
                observable = Observable(value.invoke())
                observable!!.subscribers.addAll(subscribers)
            }
        }

        fun get(): T {
            check()
            return observable!!.get()
        }

        fun set(new: T) {
            check()
            observable!!.set(new)
        }

        fun bind(listener: (new: T) -> Unit) {
            if (observable == null) subscribers.add(listener)
            else observable!!.bind(listener)
        }

        fun unbind(listener: (new: T) -> Unit) {
            if (observable == null) subscribers.remove(listener)
            else observable!!.unbind(listener)
        }

        fun notifyChange(old: T? = null, new: T? = null) {
            if (observable != null) observable!!.notifyChange()
        }
    }
}