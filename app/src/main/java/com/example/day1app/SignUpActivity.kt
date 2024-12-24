package com.example.day1app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        auth = FirebaseAuth.getInstance()
        val signUpButton = findViewById<Button>(R.id.register2)
        val emailField = findViewById<EditText>(R.id.email)
        val passwordField = findViewById<EditText>(R.id.password)


        signUpButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()
            signUp(email, password)
        }
    }

    private fun signUp(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign-up success
                    val user = auth.currentUser
                    Toast.makeText(this, "Sign-up successful!", Toast.LENGTH_SHORT).show()
                } else {
                    // Sign-up failed
                    Toast.makeText(
                        this,
                        "Authentication failed: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }


}



