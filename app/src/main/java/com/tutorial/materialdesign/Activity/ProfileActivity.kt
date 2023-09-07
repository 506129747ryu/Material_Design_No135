package com.tutorial.materialdesign.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.tutorial.materialdesign.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backBtn: ConstraintLayout = findViewById(R.id.backBtn)
        backBtn.setOnClickListener{
            startActivity(Intent(this, DashboardActivity::class.java))
        }

    }
}