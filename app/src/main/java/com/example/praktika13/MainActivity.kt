package com.example.praktika13

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val a = findViewById<EditText>(R.id.editTextText)
        val b = findViewById<EditText>(R.id.editTextText)
        val text1 = findViewById<TextView>(R.id.textView1)
        val button = findViewById<Button>(R.id.button)


        }
    fun clicked (view: View){try {
            button.setOnClickListener {
                val a = a.text.toString().toDoubleOrNull()
                val b = b.text.toString().toDoubleOrNull()
                if (a != null && b != null) {
                    val hypotenuse = sqrt(a * a + b * b)
                    val perimeter = a + b + hypotenuse
                    val area = (a * b) / 2
                    text1.text = ""
                    text1.text = """
                    Гипотенуза = $hypotenuse
                    Периметр = $perimeter
                    Площадь = $area
                """.trimIndent()
                }
            }
        }catch(e: Exception){
            Log.d("Tag", "hAOAOAOAO")
        }
    }



}