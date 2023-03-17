package com.example.studentszone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        val bottomview = findViewById<NavigationBarView>(R.id.NavigationBottom)

        //default with home activity
          replaceWithFragment(Home())

        bottomview.setOnItemReselectedListener {
            when(it.itemId){
                R.id.item1 -> replaceWithFragment(Home())
                R.id.item2 -> replaceWithFragment(Support())
               else ->{

               }

            }
            true


        }

    }

    private fun replaceWithFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.Framelayout,Home())
        fragmentTransaction.commit()

    }
}