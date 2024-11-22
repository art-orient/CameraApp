package com.art.cameraapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.art.cameraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var infoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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