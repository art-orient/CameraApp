package com.art.cameraapp

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
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
        
        if (allPermissionGranted()) {
            Toast.makeText(this, "We have Permission", Toast.LENGTH_SHORT).show()
        } else {
            ActivityCompat.requestPermissions(
                this,
                Constants.REQUIRED_PERMISSIONS,
                Constants.REQUEST_CODE_PERMISSIONS)
        }
    }

    private fun allPermissionGranted() =
        Constants.REQUIRED_PERMISSIONS.all {
            ContextCompat.checkSelfPermission(baseContext, it) ==
                    PackageManager.PERMISSION_GRANTED
        }

}