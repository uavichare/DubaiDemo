package com.example.dubaiculturelibrary;

import android.content.Context;
import android.widget.Toast;

public class MyButton {
    MyListener ml;

    // constructor

    public MyButton(MyListener ml) {
        //Setting the listener
        this.ml = ml;
    }


    public void MyLogicToIntimateOthers() {
        //Invoke the interface
        ml.s("success");
        // Toast.makeText(c,"success",Toast.LENGTH_SHORT).show();

    }
}