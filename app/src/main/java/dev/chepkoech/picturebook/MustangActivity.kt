package dev.chepkoech.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MustangActivity : AppCompatActivity() {
    lateinit var btnPreviousMustang:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mustang)
        btnPreviousMustang = findViewById(R.id.btnPreviousMustang)
        btnPreviousMustang.setOnClickListener {
            intent = Intent(this,LamborghiniActivity::class.java)
            startActivity(intent)
        }
    }
}