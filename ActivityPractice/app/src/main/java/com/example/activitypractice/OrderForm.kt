package com.example.activitypractice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class OrderForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_form)
        val radioGroupIce = findViewById<RadioGroup>(R.id.radioGroupIce)
        val radioGroupSugar = findViewById<RadioGroup>(R.id.radioGroupSugar)
        findViewById<Button>(R.id.btnSend).setOnClickListener {
            val b = Bundle()
            b.putString(
                "ice",
                radioGroupIce.findViewById<RadioButton>(radioGroupIce.checkedRadioButtonId).text.toString()
            )
            b.putString(
                "sugar",
                radioGroupSugar.findViewById<RadioButton>(radioGroupSugar.checkedRadioButtonId).text.toString()
            )
            setResult(Activity.RESULT_OK, Intent().putExtras(b))
            finish()
        }
    }
}