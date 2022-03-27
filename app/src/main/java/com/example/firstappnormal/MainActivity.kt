package com.example.firstappnormal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)

    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()

    }

    private lateinit var textView: TextView
    fun countMe1(view: View) {
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        textView.text = count.toString();
    }
    fun countMe2(view: View) {
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        if (count > 0){
            count--
        }
        else{
            val myToast = Toast.makeText(this, "Can't be negative", Toast.LENGTH_SHORT)
            myToast.show()
        }
        textView.text = count.toString();
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)
        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

}