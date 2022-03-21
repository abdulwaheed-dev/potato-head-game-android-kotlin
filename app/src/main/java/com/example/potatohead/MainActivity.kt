package com.example.potatohead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var eyes = findViewById<CheckBox>(R.id.eyes)
        var eyesimg = findViewById<ImageView>(R.id.eyesimg)

        var ears = findViewById<CheckBox>(R.id.ears)
        var earsimg = findViewById<ImageView>(R.id.earsimg)

        var nose = findViewById<CheckBox>(R.id.nose)
        var noseimg = findViewById<ImageView>(R.id.noseimg)

        var glasses = findViewById<CheckBox>(R.id.glasses)
        var glassesimg = findViewById<ImageView>(R.id.glassesimg)

        var cap = findViewById<CheckBox>(R.id.cap)
        var capimg = findViewById<ImageView>(R.id.capimg)

        var mouth = findViewById<CheckBox>(R.id.mouth)
        var mouthimg = findViewById<ImageView>(R.id.mouthimg)

        var shoes = findViewById<CheckBox>(R.id.shoes)
        var shoesimg = findViewById<ImageView>(R.id.shoesimg)

        var mustache = findViewById<CheckBox>(R.id.mustache)
        var mustacheimg = findViewById<ImageView>(R.id.mustacheimg)

        eyesimg.setVisibility(View.INVISIBLE)
        earsimg.setVisibility(View.INVISIBLE)
        noseimg.setVisibility(View.INVISIBLE)
        glassesimg.setVisibility(View.INVISIBLE)
        capimg.setVisibility(View.INVISIBLE)
        mouthimg.setVisibility(View.INVISIBLE)
        shoesimg.setVisibility(View.INVISIBLE)
        mustacheimg.setVisibility(View.INVISIBLE)

        eyes.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { eyesimg.setVisibility(View.VISIBLE) }
            else { eyesimg.setVisibility(View.INVISIBLE) }
        }
        ears.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { earsimg.setVisibility(View.VISIBLE) }
            else { earsimg.setVisibility(View.INVISIBLE) }
        }
        nose.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { noseimg.setVisibility(View.VISIBLE) }
            else { noseimg.setVisibility(View.INVISIBLE) }
        }
        glasses.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { glassesimg.setVisibility(View.VISIBLE) }
            else { glassesimg.setVisibility(View.INVISIBLE) }
        }
        cap.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { capimg.setVisibility(View.VISIBLE) }
            else { capimg.setVisibility(View.INVISIBLE) }
        }
        mouth.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { mouthimg.setVisibility(View.VISIBLE) }
            else { mouthimg.setVisibility(View.INVISIBLE) }
        }
        shoes.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { shoesimg.setVisibility(View.VISIBLE) }
            else { shoesimg.setVisibility(View.INVISIBLE) }
        }
        mustache.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) { mustacheimg.setVisibility(View.VISIBLE) }
            else { mustacheimg.setVisibility(View.INVISIBLE) }
        }

    }

    }
