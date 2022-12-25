package com.test.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActivity = findViewById<Button>(R.id.nav_host_fragment_activity_second)

            secondActivity.setOnClickListener {

                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        Log.d(TAG,  "$TAG:onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,  "$TAG:onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,  "$TAG:onResume")
    }

}