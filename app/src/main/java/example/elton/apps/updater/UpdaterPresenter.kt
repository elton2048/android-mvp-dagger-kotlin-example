package example.elton.apps.updater

import java.util.*
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by elton on 29/3/2017.
 */

class UpdaterPresenter @Inject constructor(): UpdaterContract.Presenter {
//    @Inject lateinit var mSharedPrederences: SharedPreferences
    lateinit @Inject var mUpdaterView: UpdaterContract.View
    lateinit @field:[Inject Named("package")] var mPackageName: String
    lateinit @field:[Inject Named("activity")] var mActivityName: String

    override fun start() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun install() {

        mUpdaterView.showUpdatedToast(mPackageName)

    }
}