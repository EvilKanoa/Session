package ca.kanoa.session.views

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import org.jetbrains.anko.support.v4.UI
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class WorkoutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?) = UI {
        verticalLayout {
            textView("Workout Fragment")
        }
    }.view

    companion object {
        fun newInstance(): WorkoutFragment {
            return WorkoutFragment()
        }
    }
}
