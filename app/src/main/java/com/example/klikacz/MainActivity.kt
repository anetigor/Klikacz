package com.example.klikacz

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var aSwitch: Switch
    private lateinit var punkciory: TextView // Zmieniłem nazwę zmiennej na punkcioryButton
    private lateinit var click: Button
    private lateinit var resecior: Button
private var score: Int = 0;
    private var zmienna: Int = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click = findViewById(R.id.click)
        punkciory = findViewById(R.id.punkciory)
        resecior = findViewById(R.id.reset)
        aSwitch = findViewById(R.id.switch1)




aSwitch.setOnClickListener{
    if(aSwitch.isChecked){
        zmienna = -1;

    }else {
        zmienna = 1;

    }

}



       click.setOnClickListener{

           score += zmienna;

punkciory.text = getString(R.string.wynik, score.toString())
       }

        resecior.setOnClickListener{
            score = 0;
            punkciory.text = getString(R.string.wynik, score.toString())
        }


    }
}



