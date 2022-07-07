package com.example.dubaiculturelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity implements MyListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


    }

    @Override
    public void s(String message) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void getNavFragment(Context c) {

    }

    public void callToast()
    {
        MyButton button=new MyButton(this);
        button.MyLogicToIntimateOthers("uday bevda");
    }
}