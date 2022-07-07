package com.example.dubaiculturelibrary;

import android.content.Context;
import android.widget.Toast;

public class MyButton {
    MyListener ml;

    // constructor
/*
    public MyButton(MyListener ml) {
        //Setting the listener
        this.ml = ml;
    }
*/

    public void MyLogicToIntimateOthers(Context c) {
        //Invoke the interface
        //ml.s(c, "success");
         Toast.makeText(c,"success",Toast.LENGTH_SHORT).show();

    }
}