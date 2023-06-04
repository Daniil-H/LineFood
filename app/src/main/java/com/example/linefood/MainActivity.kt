package com.example.linefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.linefood.databinding.ActivityBottomBinding
import com.example.linefood.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = object: CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish(){
                val intent = Intent(this@MainActivity,BottomActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()

    }

}