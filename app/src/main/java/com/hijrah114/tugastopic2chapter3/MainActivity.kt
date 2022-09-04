package com.hijrah114.tugastopic2chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtUmur = findViewById<EditText>(R.id.editUmur)
        val edtTinggiBadan = findViewById<EditText>(R.id.editTinggiBadan)
        val edtBeratBadan = findViewById<EditText>(R.id.editBeratBadan)
        val btnReset = findViewById<Button>(R.id.buttonReset)
        val btnIntent = findViewById<Button>(R.id.buttonIntent)
        val btnBundle = findViewById<Button>(R.id.buttonBundle)
        val btnParcelable = findViewById<Button>(R.id.buttonParcelable)
        val btnSerializable = findViewById<Button>(R.id.buttonSerializable)

        btnReset.setOnClickListener {
            edtUmur.setText("")
            edtTinggiBadan.setText("")
            edtBeratBadan.setText("")
        }

        btnIntent.setOnClickListener {
            val umur = edtUmur.text.toString().toInt()
            val tinggi = edtTinggiBadan.text.toString().toInt()
            val berat = edtBeratBadan.text.toString().toInt()

            Intent(this, HasilActivity::class.java).also {
                it.putExtra("dtUmur", umur)
                it.putExtra("dtTinggi", tinggi)
                it.putExtra("dtBerat", berat)
                startActivity(it)
            }
        }

    }
}