package com.bergerak.uts_f1d018094

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExplain = findViewById<Button>(R.id.button1)
        btnExplain.setOnClickListener(this)
        val btnChar = findViewById<Button>(R.id.button4)
        btnChar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> run {
                //deklarasi intent
                val intent_btn1 = Intent(this@MainActivity, ExplainActivity::class.java)
                startActivity(intent_btn1)
            }
            R.id.button4 -> run {
                //deklarasi intent
                val intent_btn4 = Intent(this@MainActivity, ActivityListChar::class.java)
                startActivity(intent_btn4)
            }
        }
    }
}