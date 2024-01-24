package com.jacatec.inventariofacil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Classe para configurar tempo de splash screen ao abrir o app
        Handler(Looper.getMainLooper()).postDelayed({},3000)
    }
}