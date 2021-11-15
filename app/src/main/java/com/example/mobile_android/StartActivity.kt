package com.example.mobile_android

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    override fun onBackPressed() {
        if (FirebaseAuth.getInstance().currentUser != null) {
            Toast.makeText(this, "You cannot return!", Toast.LENGTH_SHORT).show()
        } else {
            super.onBackPressed()
        }
    }
}
