package com.example.firstappnormal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util. *

class SecondActivity : AppCompatActivity() {
    private lateinit var textview_random: TextView
    private lateinit var textview_label: TextView
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textview_random = findViewById(R.id.textview_random)
        textview_label = findViewById(R.id.textview_label)
        showRandomNumber()
    }

    fun showRandomNumber() {

        val count =intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        textview_random.text= Integer.toString(randomInt)
        textview_label.text= getString(R.string.random_heading, count)
    }
}