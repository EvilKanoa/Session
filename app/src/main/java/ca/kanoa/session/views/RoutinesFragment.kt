package ca.kanoa.session.views

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.support.v4.UI
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class RoutinesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return UI {
            verticalLayout {
                textView {
                    text = "Routines"
                    gravity = Gravity.CENTER
                }
            }
        }.view
    }

    companion object {
        fun newInstance(): RoutinesFragment {
            return RoutinesFragment()
        }
    }
}
