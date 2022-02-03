package com.amunga.david.managespace

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Add Data to Enable Manage Space Option in Settings
        addSomeUserData()
    }


    private fun addSomeUserData() {
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putString("user", "johndoe")
            apply()
        }
    }
}