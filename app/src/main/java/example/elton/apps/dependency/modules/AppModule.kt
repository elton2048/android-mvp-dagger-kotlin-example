package example.elton.apps.dependency.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by elton on 29/3/2017.
 */
@Module
class AppModule(internal var mContext: Context) {

    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return mContext
    }

//    @Provides
//    @Singleton
//    internal fun provideSharedPrefs(): SharedPreferences {
//        return PreferenceManager.getDefaultSharedPreferences(mContext)
//    }
}