package com.example.neumorphism

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.neumorphism.databinding.ActivityMain2Binding
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {

    lateinit var binding :ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.neumorphImageView6.setOnClickListener{

            binding.neumorphImageView6.setShapeType(ShapeType.PRESSED)
            binding.neumorphImageView6.setColorFilter(ContextCompat.getColor(this , R.color.blue_light) , android.graphics.PorterDuff.Mode.SRC_IN)

        }


    }
}