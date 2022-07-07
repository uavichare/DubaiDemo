package com.example.dubaiculturelibrary;

import android.content.Context;

public class MyButton {
    MyListener ml;

    // constructor
    public MyButton(MyListener ml) {
        //Setting the listener
        this.ml = ml;
    }

    public void MyLogicToIntimateOthers(Context c) {
        //Invoke the interface
        ml.s(c, "success");
    }
}