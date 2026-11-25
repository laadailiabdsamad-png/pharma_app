package com.example.pharmaecomapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.pharmaecomapp.R

class AddProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        val image = findViewById<ImageButton>(R.id.imageButton2)
        val cancel = findViewById<Button>(R.id.button2)
        val home = findViewById<Button>(R.id.button3)

        image.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, 1)
        }

        cancel.setOnClickListener {
            finish()
        }

        home.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val image = findViewById<ImageButton>(R.id.imageButton2)
        image.setImageURI(data?.data)
    }
}