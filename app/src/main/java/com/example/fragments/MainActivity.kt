package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstfragment=Fragment_1()

        val bundle=Bundle()
        bundle.putString("key","The value is Android Development")
        bundle.putString("key","value is Mobile Android Development")

        firstfragment.arguments
        val secondfragment=Fragment_2()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,firstfragment)

            commit()

        }

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firstfragment)
                addToBackStack(null)
                commit()
            }

            button2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flfragment, secondfragment)
                    addToBackStack(null)
                    commit()
                }
            }
        }
    }
}