package example.elton.apps.updater

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by elton on 29/3/2017.
 */

@Module
class UpdaterPresenterModule
constructor(view: UpdaterContract.View,
            packageName: String,
            activityName: String) {
    init {
        mView = view
        mPackageName = packageName
        mActivityName = activityName
    }
    companion object {
        lateinit var mView: UpdaterContract.View
        lateinit var mPackageName: String
        lateinit var mActivityName: String
    }


    @Provides
    fun provideUpdaterContractView(): UpdaterContract.View {
        return mView
    }

    @Provides
    @Named("package")
    fun providePackageName(): String {
        return mPackageName
    }

    @Provides
    @Named("activity")
    fun provideActivityName(): String {
        return mActivityName
    }
}