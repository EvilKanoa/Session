package ca.kanoa.session.extensions

import android.view.ViewManager
import com.roughike.bottombar.BottomBar
import org.jetbrains.anko.custom.ankoView

/* BottomBar */
fun ViewManager.bottomBar() = bottomBar { }

inline fun ViewManager.bottomBar(init: BottomBar.() -> Unit) = ankoView({ BottomBar(it) }, theme = 0, init = init)