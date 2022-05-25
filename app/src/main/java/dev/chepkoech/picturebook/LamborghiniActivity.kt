package dev.chepkoech.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LamborghiniActivity : AppCompatActivity() {
    lateinit var btnNextLamborghini: Button
    lateinit var btnPreviousLamborghini:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamborghini)
        btnNextLamborghini= findViewById(R.id.btnNextLamborghini)
        btnNextLamborghini.setOnClickListener {
            intent = Intent(this, MustangActivity::class.java)
            startActivity(intent)
        }
        btnPreviousLamborghini = findViewById(R.id.btnPreviousLamborghini)
        btnPreviousLamborghini.setOnClickListener {
            intent = Intent(this, RollsRocyeActivity::class.java)
            startActivity(intent)
        }
    }
}