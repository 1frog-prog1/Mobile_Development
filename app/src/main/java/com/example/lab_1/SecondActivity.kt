package com.example.lab_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_1.databinding.ActivitySecondBinding
import java.util.*

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding


    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showRandom()
    }

    fun showRandom() {
        val max_random = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var random_int = 0

        if (max_random > 0) {
            random_int = random.nextInt(max_random + 1)
        }
        else {
            random_int = -1
        }

        binding.randomText.text = random_int.toString()
    }
}