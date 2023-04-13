package com.example.laboratorio04gomez.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.laboratorio04gomez.R

class SecondActivity : AppCompatActivity() {
    private lateinit var nameTextview: TextView
    private lateinit var emailextview: TextView
    private lateinit var phoneTextview: TextView
    private lateinit var btnCompartir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnCompartir = findViewById(R.id.btnCompartir)

        nameTextview = findViewById(R.id.tvName_new)
        val name = intent.getStringExtra(MainActivity.NOMBRE).toString()
        nameTextview.text = name

        //Email
        emailextview = findViewById(R.id.tvCorreo_new)
        val email = intent.getStringExtra(MainActivity.CORREO).toString()
        emailextview.text = email

        //Phone
        phoneTextview = findViewById(R.id.tvTelefono_new)
        val phone = intent.getStringExtra(MainActivity.TELEFONO).toString()
        phoneTextview.text = phone


        btnCompartir.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
                type = "text/plain"
            }
            startActivity(sendIntent)

        }




    }
}