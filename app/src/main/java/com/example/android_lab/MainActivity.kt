package com.example.android_lab

import android.os.Bundle
import android.widget.SeekBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Date


class RegInfo {
    var fullName: String
    var sex: Int
    var course: Int
    var difficulty: Int
    var date: Date

    constructor(_name: String, _sex: Int, _course: Int, _diff: Int, _date: Date) {
        fullName = _name
        sex = _sex
        course = _course
        difficulty = _diff
        date = _date
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val seek: SeekBar = findViewById(R.id.sbDifficulty)
    }
}