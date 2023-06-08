package com.example.linefood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BreakfastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast)
        val intent: Intent = intent
        var data = intent.getStringExtra("name")

        val zavtrak =findViewById<TextView>(R.id.textViewBreakFast)

        zavtrak.text=data
    }

    fun Back(view: View) {
        val intent = Intent(this@BreakfastActivity,BottomActivity::class.java)
        startActivity(intent)
        finish()
    }
}