package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val loginButton: Button=findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            Toast.makeText(this, "you click button", Toast.LENGTH_SHORT).show()
//            不可变量intent:实现该活动跳转到第二个活动
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}