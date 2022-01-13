package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        var button = findViewById<Button>(R.id.btnHello)
        button.setOnClickListener() {
            Toast.makeText(this, "Hello WORLD!!!", Toast.LENGTH_SHORT).show()
        }

        var movBtn = findViewById<Button>(R.id.move)
        movBtn.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        var movBtn2 = findViewById<Button>(R.id.move2)
        movBtn2.setOnClickListener {
            val intent = Intent(this, SubActivity2::class.java)
            startActivity(intent)
        }

    }
}

