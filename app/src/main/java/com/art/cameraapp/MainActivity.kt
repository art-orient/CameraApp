package com.art.cameraapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var infoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        infoTextView = findViewById(R.id.infoTextView)

        val buttonCamera = findViewById<Button>(R.id.button_camera)
        buttonCamera.setOnClickListener {
            infoTextView.text = getString(R.string.todo_camera_button)

        }

        val buttonFolder = findViewById<Button>(R.id.button_folder)
        buttonFolder.setOnClickListener {
            infoTextView.text = getString(R.string.todo_folder_button)
        }

        val buttonGallery = findViewById<Button>(R.id.button_gallery)
        buttonGallery.setOnClickListener {
            infoTextView.text = getString(R.string.todo_gallery_button)
        }


    }
}