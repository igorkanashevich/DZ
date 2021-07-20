package com.example.dz_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textOne = "Два конца, два кольца,\n" +
                "Посредине гвоздик."
        val textTwo = "Не огонь,\n" +
                "А жжется."
        val textThree = "Утром мы во двор идём —\n" +
                "Листья сыплются дождём,\n" +
                "Под ногами шелестят\n" +
                "И летят, летят, летят…"

        val random = Random()
        val list = Arrays.asList(textOne, textTwo, textThree)
        val randomAnswer = list.get(random.nextInt(list.size))
        val shov = findViewById<View>(R.id.textView) as TextView
        shov.text = randomAnswer

        val button1 = findViewById<View>(R.id.button1) as Button
        val button2 = findViewById<View>(R.id.button2) as Button
        val button3 = findViewById<View>(R.id.button3) as Button
        val tv_ansver = findViewById<View>(R.id.tv_ansver) as TextView



        button1.setOnClickListener {
            if (randomAnswer == textOne) {
                tv_ansver.text = "Отгадали"
            } else {
                tv_ansver.setText("неправильно")
            }}
        button2.setOnClickListener{
            if (randomAnswer == textTwo){
                tv_ansver.text = "Отгадали"
            }
            else{
                tv_ansver.setText("неправильно")
            }}
        button3.setOnClickListener{
            if (randomAnswer == textThree){
                tv_ansver.text = "Отгадали"}
            else {
                tv_ansver.setText("Неотгодали")
            }
        }

        }

        }





//    private  val answers = listOf(
//        if (а == )
//        "Два конца, два кольца,\n" +
//                "Посредине гвоздик.",
//
//        "Не огонь,\n" +
//                "А жжется.",
//        "Утром мы во двор идём —\n" +
//                "Листья сыплются дождём,\n" +
//                "Под ногами шелестят\n" +
//                "И летят, летят, летят…")

//    fun showAnster(view: View) {
//        val textView = findViewById<TextView>(R.id.scissors)
//        textView.text = gg().toString()
//    }
