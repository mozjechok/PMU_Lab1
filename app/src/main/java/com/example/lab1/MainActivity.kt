package com.example.lab1

import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.parser.ExpressionParser
import kotlin.math.max


class MainActivity : AppCompatActivity() {
    private lateinit var textView : EditText
    private lateinit var errorTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.ResultText)
        errorTextView = findViewById(R.id.ErrorTextView)

        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

        val number0Btn = findViewById<Button>(R.id.Number0Btn)
        number0Btn.setOnClickListener {
            updateText("0")
        }

        val number1Btn = findViewById<Button>(R.id.Number1Btn)
        number1Btn.setOnClickListener {
            updateText("1")
        }

        val number2Btn = findViewById<Button>(R.id.Number2Btn)
        number2Btn.setOnClickListener {
            updateText("2")
        }

        val number3Btn = findViewById<Button>(R.id.Number3Btn)
        number3Btn.setOnClickListener {
            updateText("3")
        }

        val number4Btn = findViewById<Button>(R.id.Number4Btn)
        number4Btn.setOnClickListener {
            updateText("4")
        }

        val number5Btn = findViewById<Button>(R.id.Number5Btn)
        number5Btn.setOnClickListener {
            updateText("5")
        }

        val number6Btn = findViewById<Button>(R.id.Number6Btn)
        number6Btn.setOnClickListener {
            updateText("6")
        }

        val number7Btn = findViewById<Button>(R.id.Number7Btn)
        number7Btn.setOnClickListener {
            updateText("7")
        }

        val number8Btn = findViewById<Button>(R.id.Number8Btn)
        number8Btn.setOnClickListener {
            updateText("8")
        }

        val number9Btn = findViewById<Button>(R.id.Number9Btn)
        number9Btn.setOnClickListener {
            updateText("9")
        }


        val divBtn = findViewById<Button>(R.id.DivBtn)
        divBtn.setOnClickListener {
            updateText("/")
        }

        val plusBtn = findViewById<Button>(R.id.PlusBtn)
        plusBtn.setOnClickListener {
            updateText("+")
        }

        val minusBtn = findViewById<Button>(R.id.MinusBtn)
        minusBtn.setOnClickListener {
            updateText("-")
        }

        val dotBtn = findViewById<Button>(R.id.DotBtn)
        dotBtn.setOnClickListener {
            updateText(".")
        }

        val multipleBtn = findViewById<Button>(R.id.MultipleBtn)
        multipleBtn.setOnClickListener {
            updateText("*")
        }

        val leftBracketBtn = findViewById<Button>(R.id.LeftBracketBtn)
        leftBracketBtn.setOnClickListener {
            updateText("(")
        }

        val rightBracketBtn = findViewById<Button>(R.id.RightBracketBtn)
        rightBracketBtn.setOnClickListener {
            updateText(")")
        }

        val sinBtn = findViewById<Button>(R.id.SinBtn)
        sinBtn.setOnClickListener {
            updateText("sin(")
        }

        val cosBtn = findViewById<Button>(R.id.CosBtn)
        cosBtn.setOnClickListener {
            updateText("cos(")
        }

        val expBtn = findViewById<Button>(R.id.ExpBtn)
        expBtn.setOnClickListener {
            updateText("exp(")
        }

        val sqrtBtn = findViewById<Button>(R.id.SqrtBtn)
        sqrtBtn.setOnClickListener {
            updateText("sqrt(")
        }

        val acBtn = findViewById<Button>(R.id.ACBtn)
        acBtn.setOnClickListener {
            textView.setText("")
            errorTextView.text = ""
        }

        val backspaceBtn = findViewById<ImageButton>(R.id.BackSpaceBtn)
        backspaceBtn.setOnClickListener {
            val curPos = textView.selectionStart

            textView.setText(String.format("%s%s", textView.text.substring(0, max(curPos - 1, 0)), textView.text.substring(curPos)))
            textView.setSelection(max(curPos - 1, 0))
            errorTextView.text = ""
        }

        val equalsBtn = findViewById<Button>(R.id.EqualsBtn)
        equalsBtn.setOnClickListener {
            try {
                val parser = ExpressionParser()
                val result = parser.evaluate(textView.text.toString())
                textView.setText(String.format("%.3f",result))
                textView.setSelection(textView.text.length)
                errorTextView.text = ""
            }
            catch (ex : Exception)
            {
                errorTextView.text = "Error"
            }
        }
    }

    private fun updateText(strToAdd : String)
    {
        val curPos = textView.selectionStart

        textView.setText(String.format("%s%s%s", textView.text.substring(0, curPos), strToAdd, textView.text.substring(curPos)))
        textView.setSelection(curPos + strToAdd.length)
        errorTextView.text = ""
    }
}