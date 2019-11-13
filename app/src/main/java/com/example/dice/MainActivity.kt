package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
//import android.R
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //for random number
        val rollButton = findViewById<Button>(R.id.rollButton)

        val imageView = findViewById(R.id.dice) as ImageView
        imageView.setImageResource(R.drawable.dice1)

        rollButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val rand = Random().nextInt(6)

                if (rand==0)
                    imageView.setImageResource(R.drawable.dice6)
                else if (rand==1)
                    imageView.setImageResource(R.drawable.dice1)
                else if (rand==2)
                    imageView.setImageResource(R.drawable.dice2)
                else if (rand==3)
                    imageView.setImageResource(R.drawable.dice3)
                else if (rand==4)
                    imageView.setImageResource(R.drawable.dice4)
                else if (rand==5)
                    imageView.setImageResource(R.drawable.dice5)
            }
        })
    }
}
