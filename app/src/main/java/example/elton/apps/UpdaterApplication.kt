package example.elton.apps

import android.app.Application
import example.elton.apps.dependency.components.AppComponent
import example.elton.apps.dependency.components.DaggerAppComponent
import example.elton.apps.dependency.modules.AppModule

/**
 * Created by elton on 29/3/2017.
 */
class UpdaterApplication : Application() {


    companion object {
        lateinit var mAppComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()

        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}