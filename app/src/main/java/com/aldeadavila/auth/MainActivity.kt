package com.aldeadavila.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aldeadavila.auth.databinding.ActivityMainBinding
import com.aldeadavila.auth.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignOut.setOnClickListener { signOut() }




    }

    private fun signOut() {
        firebaseAuth = FirebaseAuth.getInstance()
        firebaseAuth.signOut()
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}