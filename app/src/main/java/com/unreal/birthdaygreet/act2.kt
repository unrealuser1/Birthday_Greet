package com.unreal.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_act2.*

class act2 : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)

        val Person = intent.getStringExtra(NAME_EXTRA) //Get Input from main activity and put it in variable "Person"
        textView.text =  "Happy Birthday\n $Person" //Use this variable to display Birthday Greeting
    }
}