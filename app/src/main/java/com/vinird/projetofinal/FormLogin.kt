package com.vinird.projetofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vinird.projetofinal.databinding.ActivityFormLoginBinding
import com.vinird.projetofinal.databinding.ActivityMainBinding

class FormLogin : AppCompatActivity() {

    private lateinit var binding: ActivityFormLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFormLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.txtRegister.setOnClickListener {
            val intent = Intent( this,FormRegister::class.java)
            startActivity(intent)
        }
    }



}