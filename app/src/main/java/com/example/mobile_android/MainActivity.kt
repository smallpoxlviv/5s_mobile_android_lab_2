package com.example.mobile_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), SignInFragment.SignInFragmentListener, SignUpFragment.SignUpFragmentListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, SignInFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onSingUpClickedSignInFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, SignUpFragment.newInstance())
            .commit()
    }

    override fun onSignInClickedSignInFragment() {
        val intent = Intent(this, StartActivity::class.java)
        startActivity(intent)
    }

    override fun onSingUpClickedSignUpFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, SignInFragment.newInstance())
            .commit()
    }

    override fun onNavigationClickedSignUpFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, SignInFragment.newInstance())
            .commit()
    }
}
