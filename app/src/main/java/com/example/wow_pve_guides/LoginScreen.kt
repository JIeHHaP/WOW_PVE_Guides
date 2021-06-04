package com.example.wow_pve_guides

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wow_pve_guides.databinding.ActivityLoginScreenBinding

class LoginScreen : AppCompatActivity() {

    lateinit var binding: ActivityLoginScreenBinding //подключаем binding class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater) //"надуваем" разметку
        setContentView(binding.root) //доступ к разметке
    }

}