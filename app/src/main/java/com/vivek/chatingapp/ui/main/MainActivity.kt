package com.amelia.shell

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amelia.shell.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chatText.text = "Hello, I’m Amelia. Let’s begin."
    }
}
