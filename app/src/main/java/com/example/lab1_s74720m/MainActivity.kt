package com.example.lab1_s74720m

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtEditName = findViewById<EditText>(R.id.edtEditName)
        val btnPressMe = findViewById<Button>(R.id.btnPressMe)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)

        btnPressMe.setOnClickListener {
           val name = edtEditName.text.toString()
            if (name.isEmpty()){
                Toast.makeText(this, "Please enter your name ", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Assalamualaikum ,$name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}