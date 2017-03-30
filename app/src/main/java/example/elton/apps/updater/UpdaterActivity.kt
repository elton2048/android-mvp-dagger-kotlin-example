package example.elton.apps.updater

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Process
import android.widget.Toast
import com.pawegio.kandroid.runDelayed
import example.elton.apps.BasePresenter
import example.elton.apps.R
import example.elton.apps.UpdaterApplication

import javax.inject.Inject

class UpdaterActivity : AppCompatActivity(), UpdaterContract.View {

    @Inject lateinit var mUpdaterPresenter: UpdaterPresenter
//    @Inject lateinit var mSharedPreferences: SharedPreferences

    lateinit var externalPackageName: String
    lateinit var activityName: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val extras = this.intent.extras

        if (extras != null) {
            if (extras.containsKey("package")) {
                externalPackageName = extras.getString("package")
            }
            if (extras.containsKey("activity"))
                activityName = extras.getString("activity")
        } else {
            externalPackageName = "noExternalPackage"
            activityName = "noExternalActivity"
        }

        DaggerUpdaterComponent.builder()
                .appComponent(UpdaterApplication.mAppComponent)
                .updaterPresenterModule(UpdaterPresenterModule(this, externalPackageName, activityName))
                .build()
                .inject(this)

        mUpdaterPresenter.install()
    }

    override fun setPresenter(presenter: BasePresenter) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showUpdatedToast(packageName: String) {
        Toast.makeText(this, "Toast from $packageName", Toast.LENGTH_LONG).show()
    }
}
