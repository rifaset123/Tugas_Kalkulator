package com.example.tugas_kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatDelegate
import com.example.tugas_kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)  // untuk memaksa light mode
        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  /* menghubungkan dengan activity main dibawah dan ditampilkan ke UI */
    

        with(binding) {/* supaya tidak perlu memanggil binding.--- terus menerus */
            satu.setOnClickListener {
                display.setText("1")
            }
            dua.setOnClickListener {
                display.setText("2")
            }
            tiga.setOnClickListener {
                display.setText("3")
            }
            empat.setOnClickListener {
                display.setText("4")
            }
            lima.setOnClickListener {
                display.setText("5")
            }
            enam.setOnClickListener {
                display.setText("6")
            }
            tujuh.setOnClickListener {
                display.setText("7")
            }
            delapan.setOnClickListener {
                display.setText("8")
            }
            sembilan.setOnClickListener {
                display.setText("9")
            }
            buttonPerkalian.setOnClickListener {
                display.setText("x")
            }
            buttonPembagian.setOnClickListener {
                display.setText("÷")
            }
            buttonPersen.setOnClickListener {
                display.setText("%")
            }
            buttonClear.setOnClickListener {
                display.setText("")
            }
            buttonDelete.setOnClickListener {
                display.setText("")
            }
            buttonPengurangan.setOnClickListener {
                display.setText("-")
            }
            buttonPertambahan.setOnClickListener {
                display.setText("+")
            }
            buttoonSamaDengan.setOnClickListener {
                display.setText("=")
            }
            nol.setOnClickListener {
                display.setText("0")
            }
            koma.setOnClickListener {
                display.setText(",")
            }
        }
    }
}