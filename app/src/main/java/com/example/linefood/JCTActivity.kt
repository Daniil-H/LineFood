package com.example.linefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class JCTActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jctactivity)
    }

    fun getMenuJCT(view: View) {
        val zavtrak =findViewById<TextView>(R.id.textViewZavtrakDiabet)
        val obed =findViewById<TextView>(R.id.textViewObedDiabet)
        val ujin =findViewById<TextView>(R.id.textViewUjinDiabet)
        val rec=findViewById<TextView>(R.id.textViewRecommend)

        val zvtr: String = zavtrak.getText().toString()
        val obd: String = obed.getText().toString()
        val ujn: String = ujin.getText().toString()
        val recomend: String=rec.getText().toString()
        val intent = Intent(this, BottomActivity::class.java)
        intent.putExtra("name", zvtr)
        intent.putExtra("obd", obd)
        intent.putExtra("ujn", ujn)
        intent.putExtra("rec", recomend)
        startActivity(intent)
    }
}