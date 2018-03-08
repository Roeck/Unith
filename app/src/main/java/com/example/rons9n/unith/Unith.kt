package com.example.rons9n.unith

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_unith.*

class Unith : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unith)

        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, Unith::class.java)
            startActivity(leagueIntent)
        }
    }
}
