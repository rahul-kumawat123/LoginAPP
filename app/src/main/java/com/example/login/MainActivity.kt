package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

/**
 * Create an Application with login(username, password, submit button)
 * as a module and redirect to HomePage(simple screen with Welcome message)
*/

class MainActivity : AppCompatActivity() {

    var btnSubmit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit = findViewById(R.id.btn_submit)
        btnSubmit!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, HomePage::class.java)
            startActivity(intent)
        })

    }
}