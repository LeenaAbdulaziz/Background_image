package com.example.background_image

import android.annotation.SuppressLint
import android.os.Build
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
class Background {

    companion object {
        val night = 0
        val day = 1

    }

    fun changeBackground(layout:View,day:Int){

        when (day){
            0->{layout.setBackgroundResource(R.drawable.night)}
            1->{layout.setBackgroundResource(R.drawable.day)}
        }

    }
}


