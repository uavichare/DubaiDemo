package com.example.dubaiculturelibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class IndoorLibrary {

    Demo D;
    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }


/*
    public static void callNavigation(Activity v,int  id){
      //  Navigation.findNavController(v,R.id.nav_host_fragment).navigate(R.id.home_dashboard);

    }
*/

    public static void getNavFragment(Context c)
    {
        Intent intent = null;
        try {
            intent = new Intent(c,Class.forName("com.example.fragmentTest") );
            c.startActivity(intent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
