package com.example.viewbinding2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //val textView= findViewById<TextView>(R.id.textView) //it will crash as it is null coz we have to map it to activity so set it after setContent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "My Learning app"
        textView.textSize = 30f
        textView.setTextColor(getColor(R.color.colorAccent))
        editText.apply {
            isEnabled = false
            hint = "Enter your name"
            setText("Satvik Srivastava")
            addTextChangedListener {
                Log.i("ViewBinding", it.toString())
                button.isEnabled = it.toString().length in 7..19

            }
            

            }
        }
    }

   /* fun showToast(view: View) {
        Toast.makeText(view.context,"Button Pressed",Toast.LENGTH_LONG).show()
    }
}*/