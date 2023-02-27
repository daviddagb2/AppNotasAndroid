package com.gonzalezblanchard.mynotesdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gonzalezblanchard.mynotesdev.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater).apply {
            setContentView(root)

        }
    }
}