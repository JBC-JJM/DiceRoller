package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val loginButton: Button=findViewById(R.id.login_button)
        val editName:TextView=findViewById(R.id.edit_name)
        val editPassword:TextView=findViewById(R.id.edit_password)
        loginButton.setOnClickListener {
            val name=editName.text.toString()
            val password=editPassword.text.toString()
            if(name=="abc"&&password=="123"){
                Toast.makeText(this, "登入成功", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            else    Toast.makeText(this, "登入失败", Toast.LENGTH_SHORT).show()
        }
    }
}