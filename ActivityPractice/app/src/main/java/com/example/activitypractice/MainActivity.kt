package com.example.activitypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { activityResult ->
                if (activityResult.resultCode == RESULT_OK) {
                    "冰塊:${activityResult.data?.getStringExtra("ice")}".also {
                        findViewById<TextView>(
                            R.id.orderListElement2
                        ).text = it
                    }
                    "甜度:${activityResult.data?.getStringExtra("sugar")}".also {
                        findViewById<TextView>(
                            R.id.orderListElement3
                        ).text = it
                    }
                }
            }
        findViewById<Button>(R.id.btnChooser).setOnClickListener {
            val intent = Intent(this, OrderForm::class.java)
            resultLauncher.launch(intent)
        }
    }

}