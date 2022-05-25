package dev.chepkoech.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MercedesActivity : AppCompatActivity() {
    lateinit var btnNextMercedes: Button
    lateinit var btnPreviousMercedes: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercedes)
        btnNextMercedes = findViewById(R.id.btnNextMercedes)
        btnNextMercedes.setOnClickListener {
            val intent = Intent(this,RollsRocyeActivity::class.java)
            startActivity(intent)
        }
        btnPreviousMercedes = findViewById(R.id.btnPreviousMercedes)
        btnPreviousMercedes.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}