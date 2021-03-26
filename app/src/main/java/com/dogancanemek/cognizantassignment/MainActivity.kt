package com.dogancanemek.cognizantassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var usernameTxt: EditText
    private lateinit var passwordTxt: EditText
    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameTxt = findViewById(R.id.usernameTxt)
        passwordTxt = findViewById(R.id.passwordTxt)
        loginBtn= findViewById(R.id.loginBtn)

        loginBtn.setOnClickListener {
            val intent = Intent(applicationContext, ListviewActivity::class.java)
            startActivity(intent)
        }
    }
}