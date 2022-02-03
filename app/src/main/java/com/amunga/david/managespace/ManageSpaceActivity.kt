package com.amunga.david.managespace

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ManageSpaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_space)
        supportActionBar?.setTitle("Manage Space")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }


    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}