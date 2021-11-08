package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
var IsLogin= true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        Toast.makeText(applicationContext, "onCreateOptionsMenu", Toast.LENGTH_SHORT).show()
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(applicationContext, "onCreateOptionsMenu", Toast.LENGTH_SHORT).show()
        when (item.itemId) {
            R.id.contact -> {
                intent = Intent(this, Contactus::class.java)
                startActivity(intent)
            }

            R.id.setting -> {
                intent = Intent(this, Setting::class.java)
                startActivity(intent)
            }

            R.id.login -> {

                    Toast.makeText(this, "You are login ", Toast.LENGTH_SHORT).show()

            }
        }

        return super.onOptionsItemSelected(item)

    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {


            var login = menu?.findItem(R.id.login)
            var logout = menu?.findItem(R.id.logout)
            if(IsLogin){
                IsLogin=!IsLogin
                login?.setVisible(true)
                logout?.setVisible(false)
            } else {
                IsLogin=!IsLogin
                login?.setVisible(false)
                logout?.setVisible(true)
            }

            return super.onPrepareOptionsMenu(menu)

    }
}