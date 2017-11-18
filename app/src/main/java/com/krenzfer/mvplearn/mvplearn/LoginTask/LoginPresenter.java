package com.krenzfer.mvplearn.mvplearn.LoginTask;

import android.support.annotation.NonNull;

/**
 * Created by krenzfer on 14/11/17.
 */

public class LoginPresenter implements LoginContract.Presenter {

    LoginContract.View viewLogin;

    public LoginPresenter(@NonNull LoginContract.View viewLogin) {
        this.viewLogin = viewLogin;

        this.viewLogin.setPresenter(this);
    }

    @Override
    public void Start() {

    }

    @Override
    public void authenticateUser(String username, String password) {
        if(username.equalsIgnoreCase("") || password.equalsIgnoreCase("")){
            viewLogin.showLoginFailed();
        }else{
            viewLogin.showLoginSuccess();
        }
    }

    @Override
    public void registerUser(String username, String password) {

    }

}
