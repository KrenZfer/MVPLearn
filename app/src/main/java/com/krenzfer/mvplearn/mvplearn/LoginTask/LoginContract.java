package com.krenzfer.mvplearn.mvplearn.LoginTask;

import com.krenzfer.mvplearn.mvplearn.BasePresenter;
import com.krenzfer.mvplearn.mvplearn.BaseView;

/**
 * Created by krenzfer on 14/11/17.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        void showLoginFailed();
        void showLoginSuccess();
    }

    interface Presenter extends BasePresenter {
        void authenticateUser(String username, String password);
        void registerUser(String username, String password);
    }

}
