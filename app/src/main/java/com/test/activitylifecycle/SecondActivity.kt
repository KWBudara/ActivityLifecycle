package com.test.activitylifecycle

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.test.activitylifecycle.databinding.ActivitySecond2Binding

class SecondActivity : AppCompatActivity() {

    private val TAG = SecondActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
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
