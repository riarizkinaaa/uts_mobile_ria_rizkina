package com.example.belajarandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class TugasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas)

        supportActionBar?.title = "Halaman Tugas"

        val lengthLayout = findViewById<TextInputLayout>(R.id.lengthLayout)
        val widthLayout = findViewById<TextInputLayout>(R.id.widthLayout)
        val heightLayout = findViewById<TextInputLayout>(R.id.heightLayout)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val calculateButton = findViewById<Button>(R.id.calculateButton)

        calculateButton.setOnClickListener {
            val lengthText = lengthLayout.editText?.text.toString()
            val widthText = widthLayout.editText?.text.toString()
            val heightText = heightLayout.editText?.text.toString()

            if (lengthText.isNotEmpty() && widthText.isNotEmpty() && heightText.isNotEmpty()) {
                val length = lengthText.toDouble()
                val width = widthText.toDouble()
                val height = heightText.toDouble()

                val area = length * width * height
                resultTextView.text = "Hasil Luas: $area cm²"
            } else {
                resultTextView.text = "Mohon masukkan semua nilai panjang, lebar, dan tinggi."
            }
        }
    }
}




