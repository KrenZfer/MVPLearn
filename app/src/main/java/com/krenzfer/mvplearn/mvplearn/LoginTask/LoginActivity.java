package com.krenzfer.mvplearn.mvplearn.LoginTask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.krenzfer.mvplearn.mvplearn.MainTask.MainActivity;
import com.krenzfer.mvplearn.mvplearn.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View, View.OnClickListener {

    LoginContract.Presenter mPresenter;

    EditText editUsername;
    EditText editPassword;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        editUsername = (EditText) findViewById(R.id.username);
        editPassword = (EditText) findViewById(R.id.password);

        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(this);

        mPresenter = new LoginPresenter(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.Start();
    }

    @Override
    public void setPresenter(@NonNull  LoginContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showLoginFailed() {
        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginSuccess() {
        Toast.makeText(this, "Login Succesfull", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.loginBtn:
                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();

                mPresenter.authenticateUser(username, password);
                break;
            default:

        }
    }
}
