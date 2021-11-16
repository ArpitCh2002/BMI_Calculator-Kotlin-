package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bmi = intent.getDoubleExtra("bmi", -1.0)
        if (bmi == -1.0) {
            containerResult.visibility = View.GONE
        }
        else {
            bmiValueTV.text = bmi.toString()

            if (bmi < 18.5) {
                containerResult.setBackgroundResource(R.drawable.yellow_background)
                bmiFlagImageView.setImageResource(R.drawable.ic_exclamation_mark)
                bmiLabelTV.text = "You are Underweight!"
                commentTV.text = "Here are some advice to increase your Weight: "
                adviceOneImage.setImageResource(R.drawable.ic_nowater)
                adviceOneTextView.text = "Don't drink water before meals!"
                adviceTwoImage.setImageResource(R.drawable.ic_bigmeal)
                adviceTwoTextView.text = "Take Heavy Meals!"
                adviceThreeImage.setImageResource(R.drawable.ic_sleep)
                adviceThreeTextView.text = "Get Quality Sleep!"
            }
            else {
                if (bmi > 25) {
                    containerResult.setBackgroundResource(R.drawable.red_background)
                    bmiFlagImageView.setImageResource(R.drawable.ic_warning)
                    bmiLabelTV.text = "You are Overweight!"
                    commentTV.text = "Here are some advice to reduce your Weight: "
                    adviceOneImage.setImageResource(R.drawable.ic_water)
                    adviceOneTextView.text = "Don't drink water upto an hour after taking meals!"
                    adviceTwoImage.setImageResource(R.drawable.ic_eggs)
                    adviceTwoTextView.text = "Eat boiled eggs regularly!"
                    adviceThreeImage.setImageResource(R.drawable.ic_nosugar)
                    adviceThreeTextView.text = "Drink Coffee/Tea and avoid sugary foods!"
                }
            }
        }
    }
}

