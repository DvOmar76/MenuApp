package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.home -> {
                startActivity(Intent(applicationContext,Home::class.java))
                return  true
            }
            R.id.help -> {
                startActivity(Intent(applicationContext,Help::class.java))
                return true
            }
            R.id.about -> {
                startActivity(Intent(applicationContext,About::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}