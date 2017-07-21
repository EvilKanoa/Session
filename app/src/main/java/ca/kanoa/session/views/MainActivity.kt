package ca.kanoa.session.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ca.kanoa.session.R
import ca.kanoa.session.extensions.bottomBar
import ca.kanoa.session.extensions.setupKovenant
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.above
import org.jetbrains.anko.alignParentBottom
import org.jetbrains.anko.dip
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.info
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.relativeLayout

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupKovenant()

        relativeLayout {
            lparams(width = matchParent, height = matchParent)

            val container = frameLayout {
                id = R.id.main_container
            }.lparams(width = matchParent, height = matchParent) { above(R.id.bottom_bar) }

            bottomBar {
                id = R.id.bottom_bar
                setItems(R.xml.main_bottombar_tabs)
                setOnTabSelectListener {
                    info { "tab: $it selected" }
                }
            }.lparams(width = matchParent, height = dip(60)) {
                alignParentBottom()
            }
        }
    }
}
