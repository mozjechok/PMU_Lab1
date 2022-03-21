package com.example.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.parser.ExpressionParser

//import javax.script.Compilable
//import javax.script.ScriptEngine
//import javax.script.ScriptEngineManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number0Btn = findViewById<Button>(R.id.Number0Btn)
        number0Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("0")
        }

        val number1Btn = findViewById<Button>(R.id.Number1Btn)
        number1Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("1")
        }

        val number2Btn = findViewById<Button>(R.id.Number2Btn)
        number2Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("2")
        }

        val number3Btn = findViewById<Button>(R.id.Number3Btn)
        number3Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("3")
        }

        val number4Btn = findViewById<Button>(R.id.Number4Btn)
        number4Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("4")
        }

        val number5Btn = findViewById<Button>(R.id.Number5Btn)
        number5Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("5")
        }

        val number6Btn = findViewById<Button>(R.id.Number6Btn)
        number6Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("6")
        }

        val number7Btn = findViewById<Button>(R.id.Number7Btn)
        number7Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("7")
        }

        val number8Btn = findViewById<Button>(R.id.Number8Btn)
        number8Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("8")
        }

        val number9Btn = findViewById<Button>(R.id.Number9Btn)
        number9Btn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("9")
        }


        val divBtn = findViewById<Button>(R.id.DivBtn)
        divBtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("/")
        }

        val plusBtn = findViewById<Button>(R.id.PlusBtn)
        plusBtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("+")
        }

        val minusBtn = findViewById<Button>(R.id.MinusBtn)
        minusBtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus("-")
        }

        val acBtn = findViewById<Button>(R.id.ACBtn)
        acBtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = "";
        }

        val backspaceBtn = findViewById<ImageButton>(R.id.BackSpaceBtn)
        backspaceBtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.dropLast(1)
        }

        val dotBtn = findViewById<Button>(R.id.DotBtn)
        dotBtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)
            textView.text = textView.text.toString().plus(".")
        }

        val equalsBtn = findViewById<Button>(R.id.EqualsBtn)
        equalsBtn.setOnClickListener {
            val textView = findViewById<TextView>(R.id.ResultText)

            val parser = ExpressionParser();
            textView.text = parser.evaluate(textView.text.toString()).toString();
            //val runner: ScriptEngine = ScriptEngineManager(currentClassLoader()).getEngineByExtension("JavaScript")
            //textView.text = runner.eval(textView.text.toString())
        }
    }
}