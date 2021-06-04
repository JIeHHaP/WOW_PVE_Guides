package com.example.wow_pve_guides

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.wow_pve_guides.databinding.ActivityLoginScreenBinding

class LoginScreen : AppCompatActivity() {
    private var launcher: ActivityResultLauncher<Intent>? = null
    lateinit var binding: ActivityLoginScreenBinding //подключаем binding class

    var login = "empty"
    var password = "empty"
    var email = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater) //"надуваем" разметку
        setContentView(binding.root) //доступ к разметке

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult ->
            if (result.resultCode == RESULT_OK){
                login = result.data?.getStringExtra("reg_login").toString() //проверить, возможно переписать
                password = result.data?.getStringExtra("reg_login").toString()
                email = result.data?.getStringExtra("reg_login").toString()
            }
        }

        binding.btnSignUp.setOnClickListener {
            
        }
    }

}