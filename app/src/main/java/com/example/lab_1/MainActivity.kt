package com.example.lab_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var it = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "0"
    }


    fun add1(view: View) {
        it += 1
        binding.textView.text = it.toString()
    }

    fun random(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, it)
        startActivity(randomIntent)
    }
}

