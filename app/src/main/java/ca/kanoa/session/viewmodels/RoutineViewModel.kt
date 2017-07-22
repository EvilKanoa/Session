package ca.kanoa.session.viewmodels

import ca.kanoa.session.utilities.lazyObservable

class RoutineViewModel {
    var routine = lazyObservable { "Hello" }

    fun rename(name: String) { routine.set(name) }
}