package com.example.sharedpreferences_p10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tutleFromPrefs = resources.getString(R.string.title_text)
        val boolean_key1 = resources.getBoolean(R.bool.boolean_key1)
        val boolean_key2 = resources.getBoolean(R.bool.boolean_key2)
        val boolean_key3 = resources.getBoolean(R.bool.boolean_key3)
        val boolean_key4 = resources.getBoolean(R.bool.boolean_key4)
        Log.d("savelo", "$boolean_key1, $boolean_key2, $boolean_key3, $boolean_key4")
    }
}