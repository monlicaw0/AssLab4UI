package com.myweb.asslab4ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showDate(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")

    }
    fun showResult(view : View){

        var  radioGroup: RadioGroup =  findViewById(R.id.radioGroup)
        var  selectedId : Int = radioGroup.checkedRadioButtonId
        var  radioButton : RadioButton = findViewById(selectedId)

        txt_result.text = "Neme: ${edit_name.text }\nPassword: ${edit_password.text}\n" +
                "Gender: ${radioButton.text}\nE-mail: " +
                "${edit_email.text}\n" +
                "Birthday: ${txt_bd.text} "
    }

    fun resetData(v: View){
        edit_name.text.clear()
        edit_password.text.clear()
        edit_email.text.clear()
        txt_bd.text = "mm / dd / yy"
        radioGroup.clearCheck()
        txt_result.text = "Show Information"

    }
}
