package example.elton.apps.updater;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by elton on 30/3/2017.
 */

@Module
public class UpdaterPresenterModuleJa {

    private final UpdaterContract.View mView;

    private final String mPackageName;

    private final String mActivityName;

    public UpdaterPresenterModuleJa(UpdaterContract.View view, String packageName, String activityName) {
        mView = view;
        mPackageName = packageName;
        mActivityName = activityName;
    }

    @Provides
    UpdaterContract.View provideUpdaterContractView() {
        return mView;
    }

    @Provides @Named("package")
    String providePackageName() {
        return mPackageName;
    }

    @Provides
    String provideActivityName() {
        return mActivityName;
    }
}
