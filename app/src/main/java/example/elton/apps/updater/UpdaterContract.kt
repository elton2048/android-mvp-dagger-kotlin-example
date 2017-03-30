package example.elton.apps.updater

import example.elton.apps.BasePresenter

/**
 * Created by elton on 29/3/2017.
 */
interface UpdaterContract {
    interface View: BaseView<Presenter> {
        fun showUpdatedToast(packageName: String)
    }

    interface Presenter: BasePresenter {
        fun install()
    }
}