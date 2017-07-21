package ca.kanoa.session.extensions

import android.support.v7.app.AppCompatActivity
import nl.komponents.kovenant.android.androidUiDispatcher
import nl.komponents.kovenant.android.startKovenant
import nl.komponents.kovenant.ui.KovenantUi

fun AppCompatActivity.setupKovenant() {
    startKovenant()
    KovenantUi.uiContext {
        dispatcher = androidUiDispatcher()
    }
}