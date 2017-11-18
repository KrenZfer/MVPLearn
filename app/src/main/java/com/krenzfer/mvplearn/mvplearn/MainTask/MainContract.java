package com.krenzfer.mvplearn.mvplearn.MainTask;

import com.krenzfer.mvplearn.mvplearn.BasePresenter;
import com.krenzfer.mvplearn.mvplearn.BaseView;

/**
 * Created by krenzfer on 18/11/17.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {
        void userSignOut();
    }

    interface Presenter extends BasePresenter {
        void onUserSignOut();
    }

}
