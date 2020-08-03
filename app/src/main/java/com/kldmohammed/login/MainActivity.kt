package com.kldmohammed.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kldmohammed.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            performLogin()
        }
    }

    private fun performLogin() {
        val email = binding.emailEt.asString()
        val password = binding.passwordEt.asString()
        if (!email.isValidEmail()){
            toast("Email is not valid :(")
            return
        }
        if (!password.isValidPassword()){
            toast("Password should be at least four character")
            return
        }


        binding.root.snackBar("Success")
    }
}