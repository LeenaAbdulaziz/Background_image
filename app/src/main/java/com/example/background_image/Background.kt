package com.example.background_image

import android.annotation.SuppressLint
import android.os.Build
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
class Background {

    companion object {
        val day = "day"
        val night = "night"

    }

    fun changeBackground(layout:View,day:String){

        when (day){
            "night"->{layout.setBackgroundResource(R.drawable.night)}
            "day"->{layout.setBackgroundResource(R.drawable.day)}
        }

    }
}


