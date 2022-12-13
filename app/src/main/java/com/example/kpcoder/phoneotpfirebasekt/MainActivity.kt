package com.example.kpcoder.phoneotpfirebasekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kpcoder.phoneotpfirebasekt.utils.FirebaseUtils.auth

class MainActivity : AppCompatActivity() {

    private lateinit var signOutBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signOutBtn = findViewById(R.id.signOutBtn)

        signOutBtn.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, PhoneActivity::class.java))
        }
    }
}