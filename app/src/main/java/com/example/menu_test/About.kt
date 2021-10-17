package com.example.menu_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    fun homepage(item: MenuItem) {
        val intent= Intent(this,Home::class.java)
        startActivity(intent)
    }
    fun info(item: MenuItem) {
        val intent= Intent(this,About::class.java)
        startActivity(intent)
    }
    fun helppage(item: MenuItem) {
        val intent= Intent(this,Help::class.java)
        startActivity(intent)
    }
}