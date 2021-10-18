package com.example.background_image

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button.setOnClickListener(this)
    }



@SuppressLint("ResourceType")
@RequiresApi(Build.VERSION_CODES.M)
override fun onClick(v: View?) {
    val background="Day"
    val bb="Night"
    val bg=ed.text.toString().lowercase()
    when (bg) {
        background.lowercase() -> {
                Background().changeBackground(relative_layout,Background.day)}
        bb.lowercase() -> {
             Background().changeBackground(relative_layout,Background.night)}
        else -> {
            Toast.makeText(applicationContext," somthing wrong", Toast.LENGTH_SHORT).show()
        }
    }

}

}



