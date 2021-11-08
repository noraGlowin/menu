package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.contact->{
                intent= Intent(this,Contactus ::class.java)
                startActivity(intent)
            }

            R.id.setting ->{
                intent= Intent(this,Setting::class.java)
                startActivity(intent)
            }

            R.id.login -> {Toast.makeText(this,"You are login ",Toast.LENGTH_SHORT).show() }

            R.id.logout -> {Toast.makeText(this,"You are logOut ",Toast.LENGTH_SHORT).show() }
        }

        return super.onOptionsItemSelected(item)

    }
}