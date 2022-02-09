package com.powerteamdeveloper.covidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splas_screen.*

class SplasScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas_screen)


        btnGo.setOnClickListener{
            Intent(this,MainActivity::class.java ).also {
                startActivity(it)
            }
        }

    }
}