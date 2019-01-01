package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //=====binding to the buttons ==
        val submit = findViewById<Button>(R.id.alert)


        //we call button on click listener
        submit.setOnClickListener {

            //create val for alert
            val simpleAlert = AlertDialog.Builder(this).create()

            //===use the variable to design the alert dialog
            simpleAlert.setTitle("Confirmation")
            simpleAlert.setMessage("Do you want to proceed?")

            simpleAlert.setButton(AlertDialog.BUTTON_POSITIVE, "Yes") {

                //we call the dialog interface
//                dialog: DialogInterface?, which: Int ->
//
//                dialog?.dismiss() //for closing the dialog

                //NB: since we are not using dismiss, we rename it to _


                //we call the dialog interface
                _: DialogInterface?, which: Int ->

                //dialog?.dismiss() //for closing the dialog

                Toast.makeText(this, "You said yes", Toast.LENGTH_LONG).show()
                //"you said yes",  can navigate to any activity
            }


            //======for negative button

            simpleAlert.setButton(AlertDialog.BUTTON_NEGATIVE , "No") {

                //calling dialog interface
                dialog: DialogInterface?, which: Int ->

                dialog?.dismiss() // for closing

                Toast.makeText(this, "You said No", Toast.LENGTH_LONG).show()
            }

            //we show our alert

            simpleAlert.show()

        }
    }
}
