package com.example.dz14_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val ansvers = listOf(
        "да",
        "нет",
        "Скорее всего да",
        "Скорее всего нет",
        "Возможно",
        "Имеются перспективы"
    )

    fun showAnswer(view: View) {
        val editText = findViewById<TextView>(R.id.editTextTextPersonName)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "${editText} ${ansvers.random()}"
    }
}

