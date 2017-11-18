package com.krenzfer.mvplearn.mvplearn.MainTask;

/**
 * Created by krenzfer on 18/11/17.
 */

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mainView;

    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;

        this.mainView.setPresenter(this);
    }

    @Override
    public void Start() {

    }

    @Override
    public void onUserSignOut() {
        mainView.userSignOut();
    }
}
