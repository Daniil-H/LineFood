package com.example.linefood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DiabetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabets)

    }


    fun getBack(view: View) {
        val intent = Intent(this@DiabetsActivity,BottomActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun getMenuDiabet(view: View) {
        val zavtrak =findViewById<TextView>(R.id.textViewZavtrakDiabet)

        val zvtr: String = zavtrak.getText().toString()
        val intent = Intent(this, BreakfastActivity::class.java)
        intent.putExtra("name", zvtr)
        startActivity(intent)

    }
}