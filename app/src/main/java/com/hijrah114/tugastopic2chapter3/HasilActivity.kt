package com.hijrah114.tugastopic2chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val tvUmur = findViewById<TextView>(R.id.textViewUmur)
        val tvTinggi = findViewById<TextView>(R.id.textViewTinggi)
        val tvBerat = findViewById<TextView>(R.id.textViewBerat)
        val tvBMI = findViewById<TextView>(R.id.textViewBMI)
        val tvKategori = findViewById<TextView>(R.id.textViewKategori)

        val umur = intent.getIntExtra("dtUmur", 0)
        val tinggi = intent.getIntExtra("dtTinggi", 0)
        val berat = intent.getIntExtra("dtBerat", 0)
        val bmi = (berat / (tinggi*2)).toString()
        val kategori = when ((bmi.toDouble())) {
            in 1.0 .. 15.0 -> "Terlalu Kurus"
            in 16.0 .. 17.0 -> "Cukup Kurus"
            in 17.0 .. 18.5 -> "Sedikit Kurus"
            in 18.5 .. 25.0 -> "Normal"
            in 25.0 .. 30.0 -> "Gemuk"
            in 30.0 .. 35.0 -> "Obesitas Kelas I"
            in 35.0 .. 40.0 -> "Obesitas Kelas II"
            else -> "Obesitas Kelas III"
        }

        val dataUmur     = "Umur Anda    : $umur tahun"
        val dataTinggi   = "Tinggi Badan : $tinggi cm"
        val dataBerat    = "Berat Badan  : $berat kg"
        val dataBMI      = "BMI Anda     : $bmi"
        val dataKategori = "Kategori     : $kategori"

        tvUmur.text = dataUmur
        tvTinggi.text = dataTinggi
        tvBerat.text = dataBerat
        tvBMI.text = dataBMI
        tvKategori.text = dataKategori

    }
}