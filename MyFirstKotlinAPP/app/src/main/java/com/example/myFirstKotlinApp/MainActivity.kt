package com.example.myFirstKotlinApp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.widget.TextView
import com.example.myFirstKotlinApp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        var counter = 0
        binding.fab.setOnClickListener {
            val txtCounter: TextView? = binding.root.findViewById(R.id.counter)
            counter++
            txtCounter?.text = "$counter"
        }
    }
}