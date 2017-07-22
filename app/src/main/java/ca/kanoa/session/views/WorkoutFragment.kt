package ca.kanoa.session.views

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ca.kanoa.session.viewmodels.RoutineViewModel
import org.jetbrains.anko.button
import org.jetbrains.anko.editText
import org.jetbrains.anko.support.v4.UI
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class WorkoutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val viewModel = RoutineViewModel()

        return UI {
            verticalLayout {
                textView("Workout Fragment") {
                    viewModel.routine.bind { text = it }
                }
                val field = editText()
                button("Press me") {
                    setOnClickListener { viewModel.rename(field.text.toString()) }
                }
            }
        }.view
    }

    companion object {
        fun newInstance(): WorkoutFragment {
            return WorkoutFragment()
        }
    }
}
