package dev.chepkoech.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RollsRocyeActivity : AppCompatActivity() {
    lateinit var btnNextRollsRoyce: Button
    lateinit var btnPreviousRollsRoyce: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rolls_rocye)
        btnNextRollsRoyce = findViewById(R.id.btnNextRollsRoyce)
        btnNextRollsRoyce.setOnClickListener {
            val intent = Intent(this, LamborghiniActivity::class.java)
            startActivity(intent)
        }
        btnPreviousRollsRoyce = findViewById(R.id.btnPreviousRollsRoyce)
        btnPreviousRollsRoyce.setOnClickListener {
            val intent = Intent(this,MercedesActivity::class.java)
            startActivity(intent)
        }
    }
}