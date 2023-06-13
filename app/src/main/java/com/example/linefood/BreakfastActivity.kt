package com.example.linefood

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BreakfastActivity : AppCompatActivity() {
    var pref : SharedPreferences? = null
    var data: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast)
        val intent: Intent = intent
        //data = intent.getStringExtra("name")
       // pref=getSharedPreferences("Table", Context.MODE_PRIVATE)
        //data = pref?.getString("zavtrak",data)!!
        //val zavtrak =findViewById<TextView>(R.id.textViewBreakFast)
        //zavtrak.text=data

    }

    fun SaveData(res: String?)
    {
        val editor = pref?.edit()
        editor?.putString("zavtrak", res)
        editor?.apply()
    }


    fun Back(view: View) {
        val intent = Intent(this@BreakfastActivity,BottomActivity::class.java)
        startActivity(intent)
        finish()
        SaveData(data)
    }

    override fun onDestroy() {
        super.onDestroy()
        SaveData(data)
    }
}