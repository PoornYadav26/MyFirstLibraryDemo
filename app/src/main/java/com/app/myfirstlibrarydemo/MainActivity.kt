package com.app.myfirstlibrarydemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.app.mylibrarybutton.MySnackyBar
import com.example.myfirstlibrarydemo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rootView: View = findViewById(R.id.rootView)

        val button = findViewById<Button>(R.id.btnsnackbar)

        button.setOnClickListener {
            MySnackyBar.showSnackbar(rootView, "This is a test message!!")
        }


    }
}