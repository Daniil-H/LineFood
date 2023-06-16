package com.example.linefood

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.linefood.databinding.ActivityBottomBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomActivity : AppCompatActivity() {
    var data: String? = ""
    var obeda: String? = ""
    var ujina: String? = ""
    var pref : SharedPreferences? = null

    private lateinit var binding: ActivityBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_bottom)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        val intent: Intent = intent
        data = intent.getStringExtra("name")
        obeda = intent.getStringExtra("obd")
        ujina = intent.getStringExtra("ujn")
        //pref=getSharedPreferences("Table", Context.MODE_PRIVATE)
        //data = pref?.getString("zavtrak",data)!!
        //obeda = pref?.getString("obed",obeda)!!
        //ujina = pref?.getString("ujin",ujina)!!
        val zavtrak =findViewById<TextView>(R.id.Zavtrak)
        val obd =findViewById<TextView>(R.id.obed)
        val ujn =findViewById<TextView>(R.id.ujin)
        zavtrak.text = data
        obd.text=obeda
        ujn.text=ujina

        if (zavtrak.text!="" && obd.text!="" && ujn.text!="")
        {
            val textView=findViewById<TextView>(R.id.textView8)
            val textViewob=findViewById<TextView>(R.id.textView9)
            val textViewuj=findViewById<TextView>(R.id.textView10)
            textView.setVisibility(View.VISIBLE)
            textViewob.setVisibility(View.VISIBLE)
            textViewuj.setVisibility(View.VISIBLE)
        }

        //val prefs = getSharedPreferences("com.example.app", MODE_PRIVATE)
        //prefs.edit().putString("tag", zavtrak.getText().toString()).apply();
        //zavtrak.setText(prefs.getString("tag", ""));



    }

    fun SaveData(res: String?)
    {
        val editor = pref?.edit()
        editor?.putString("zavtrak", res)
        editor?.putString("obed", res)
        editor?.putString("ujin", res)
        editor?.apply()
    }

    fun newActivity(view: View) {
        val intent = Intent(this@BottomActivity,DiabetsActivity::class.java)
        startActivity(intent)
        finish()
        SaveData(data)
        //SaveData(obeda)
        //SaveData(ujina)
    }

    override fun onDestroy() {
        super.onDestroy()
        SaveData(data)
        //SaveData(obeda)
        //SaveData(ujina)
    }


    fun newActivitySvouaDieta(view: View) {
        val intent = Intent(this@BottomActivity,SvoeMenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}