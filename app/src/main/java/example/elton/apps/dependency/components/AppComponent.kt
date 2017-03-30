package example.elton.apps.dependency.components

import android.app.Application
import dagger.Component
import dagger.Module
import example.elton.apps.UpdaterApplication
import example.elton.apps.dependency.modules.AppModule
import example.elton.apps.updater.UpdaterActivity
import javax.inject.Singleton

/**
 * Created by elton on 29/3/2017.
 */

@Singleton
@Component(modules = arrayOf(
        AppModule::class
))
interface AppComponent {
}