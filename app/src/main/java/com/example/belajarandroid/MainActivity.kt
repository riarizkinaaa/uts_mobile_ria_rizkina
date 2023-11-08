package com.example.belajarandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val usernameLayout = findViewById<TextInputLayout>(R.id.usernameLayout)
        val passwordLayout = findViewById<TextInputLayout>(R.id.passwordLayout)

        loginButton.setOnClickListener {
            val username = usernameLayout.editText?.text.toString()
            val password = passwordLayout.editText?.text.toString()

            try {
                // Kode login yang mungkin menghasilkan kesalahan
                if (username == "admin" && password == "123") {
                    // Login berhasil, berpindah ke halaman selanjutnya
                    val intent = Intent(this, TugasActivity::class.java)
                    startActivity(intent)
                } else {
                    // Login gagal, munculkan exception untuk menunjukkan kesalahan
                    throw Exception("Kombinasi username dan password salah")
                }
            } catch (e: Exception) {
                // Tangani kesalahan di sini
                e.printStackTrace() // Cetak stack trace untuk debugging
                showToast("Terjadi kesalahan: ${e.message}")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

