package com.example.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private Button loginButton;
    private TextView register;
    private boolean isHideFirst = true;// 输入框密码是否是隐藏的，默认为true

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.password);
        imageView = (ImageView) findViewById(R.id.eyes);
        loginButton = (Button) findViewById(R.id.login);
        register = (TextView) findViewById(R.id.registerByPhone);
        imageView.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        register.setOnClickListener(this);
        imageView.setImageResource(R.drawable.close);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eyes:
                if (isHideFirst == true) {
                    imageView.setImageResource(R.drawable.open);
                    //密文
                    HideReturnsTransformationMethod method1 = HideReturnsTransformationMethod.getInstance();
                    editText.setTransformationMethod(method1);
                    isHideFirst = false;
                } else {
                    imageView.setImageResource(R.drawable.close);
                    //密文
                    TransformationMethod method = PasswordTransformationMethod.getInstance();
                    editText.setTransformationMethod(method);
                    isHideFirst = true;
                }
                // 光标的位置
                int index = editText.getText().toString().length();
                editText.setSelection(index);
                break;
            case R.id.login:
                Intent intent = new Intent(MainActivity.this,homepageActivity.class);
                startActivity(intent);
                break;
            case R.id.registerByPhone:
                Intent intent1 = new Intent(MainActivity.this,phoneVerificationActivity.class);
                startActivity(intent1);
        }
    }
}
