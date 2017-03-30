package example.elton.apps.updater

import dagger.Component
import example.elton.apps.dependency.components.AppComponent
import example.elton.apps.util.ActivityFragmentScoped

/**
 * Created by elton on 29/3/2017.
 */

@ActivityFragmentScoped
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(UpdaterPresenterModule::class))
interface UpdaterComponent {
    fun inject(activity: UpdaterActivity)
}