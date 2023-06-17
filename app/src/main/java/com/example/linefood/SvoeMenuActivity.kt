package com.example.linefood

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SvoeMenuActivity : AppCompatActivity() {
    var pref : SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_svoe_menu)
        pref=getSharedPreferences("Table", Context.MODE_PRIVATE)


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

    fun SaveData(res: String)
    {
        val editor = pref?.edit()
        editor?.putString("zavtrak", res)
        editor?.putString("obed", res)
        editor?.putString("ujin", res)
        editor?.apply()
    }
    override fun onDestroy() {
        super.onDestroy()
    }


    fun getBack(view: View) {
        val intent = Intent(this@SvoeMenuActivity,BottomActivity::class.java)
        startActivity(intent)
        finish()
    }
}