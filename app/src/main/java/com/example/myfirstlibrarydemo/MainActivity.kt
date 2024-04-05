package com.example.myfirstlibrarydemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mylibrarybutton.MySnackyBar

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