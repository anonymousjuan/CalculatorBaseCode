package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var btnA :Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnA = findViewById(R.id.btn_A)
      etA = findViewById(R.id.et_A)
       etB = findViewById(R.id.et_B)
        resultTV = findViewById(R.id.result_tv)


    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0

        when(v?.id){
            R.id.btn_A->{
                result= a+b
            }
        }
        resultTV.text="$result"
    }
}