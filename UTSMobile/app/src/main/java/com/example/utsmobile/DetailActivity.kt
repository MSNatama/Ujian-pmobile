package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.utsmobile.model.NBA

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val pict = findViewById<ImageView>(R.id.Det_gambar)
        val name = findViewById<TextView>(R.id.Det_nama)
        val team = findViewById<TextView>(R.id.Det_team)
        val pos = findViewById<TextView>(R.id.Det_pos)
        val jersey = findViewById<TextView>(R.id.Det_jersey)
        val point = findViewById<TextView>(R.id.Det_point)
        val hw = findViewById<TextView>(R.id.Det_WH)


        val intent = this.intent
        var data = intent.getSerializableExtra("data") as? NBA
        name.text = data?.name
        team.text = getString(R.string.tim,data?.team)
        pos.text = getString(R.string.pos,data?.pos)
        jersey.text = getString(R.string.jersey, data?.jersey)
        point.text = getString(R.string.point, data?.score,"285")
        hw.text = getString(R.string.hw, data?.height,"191 cm")
        pict.setImageResource(data?.imageResourceId!!)


    }
}