package com.example.linefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SvoeMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_svoe_menu)
    }

    fun getMenuSvoe(view: View) {
        val zavtrak =findViewById<TextView>(R.id.editTextTextPersonName2)
        val obed =findViewById<TextView>(R.id.editTextTextPersonName3)
        val ujin =findViewById<TextView>(R.id.editTextTextPersonName4)

        val zvtr: String = zavtrak.getText().toString()
        val obd: String = obed.getText().toString()
        val ujn: String = ujin.getText().toString()
        val intent = Intent(this, BottomActivity::class.java)
        intent.putExtra("name", zvtr)
        intent.putExtra("obd", obd)
        intent.putExtra("ujn", ujn)
        startActivity(intent)
    }

    fun getBack(view: View) {
        val intent = Intent(this@SvoeMenuActivity,BottomActivity::class.java)
        startActivity(intent)
        finish()
    }
}