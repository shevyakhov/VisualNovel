package com.example.visualnovel

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        confirmBut.setOnClickListener {
            if (personName.text.toString().isNotEmpty()) {
                val username = personName.text.toString()
                intent = Intent(this, StoryActivity::class.java)
                intent.putExtra(USERNAME, username)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
            } else {
                Toast.makeText(this, getString(R.string.toastText), Toast.LENGTH_SHORT).show()

            }
        }
    }
}