package com.example.dubaiculturelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity implements MyListener {
    MyButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

         button=new MyButton(this);

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
        button.MyLogicToIntimateOthers("uday bevda");
    }
}