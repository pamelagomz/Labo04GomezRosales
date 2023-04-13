package com.example.laboratorio04gomez.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laboratorio04gomez.R
import com.example.laboratorio04gomez.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    private lateinit var btnGuardar: Button
    private lateinit var nameEditText: TextInputEditText
    private lateinit var emailEditText: TextInputEditText
    private lateinit var phoneEditText: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText= findViewById(R.id.textInputEditNombre)
        emailEditText = findViewById(R.id.textInputEditCorreo)
        phoneEditText = findViewById(R.id.textInputEditTelefono)
        btnGuardar = findViewById(R.id.btnGuardar)

        btnGuardar.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(NOMBRE,nameEditText.text.toString())
            intent.putExtra(CORREO,emailEditText.text.toString())
            intent.putExtra(TELEFONO,phoneEditText.text.toString())
            startActivity(intent)
        }


    }
    companion object {
        const val NOMBRE = "NOMBRE"
        const val CORREO = "CORREO"
        const val TELEFONO = "TELEFONO"

    }

}