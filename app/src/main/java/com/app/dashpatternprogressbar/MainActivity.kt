package com.app.dashpatternprogressbar

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.dashpatternprogressbar.custom.CircularProgressBar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSetProgress).setOnClickListener {
            val progress = Random.nextInt(0, 100)
            findViewById<TextView>(R.id.tvProgress).text = "$progress/100"
            findViewById<CircularProgressBar>(R.id.circularProgressBar).animateProgress(progress)
        }
    }
}