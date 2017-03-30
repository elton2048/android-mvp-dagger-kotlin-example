package example.elton.apps.updater

import example.elton.apps.BasePresenter

/**
 * Created by elton on 29/3/2017.
 */
interface BaseView<T> {
    fun setPresenter(presenter: BasePresenter)
}