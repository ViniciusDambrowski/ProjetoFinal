package com.vinird.projetofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FormRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_register)
        supportActionBar?.hide()
    }
}