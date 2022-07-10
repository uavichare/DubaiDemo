package com.example.dubaiculturedemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dubaiculturelibrary.MyListener

class MainActivity : AppCompatActivity(),MyListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun s(message: String?) {
        TODO("Not yet implemented")
    }

    override fun getNavFragment(c: Context?) {
        TODO("Not yet implemented")
    }
}