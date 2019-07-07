package com.hp.myapplication

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msg ="TOASTMESSAGE"

        Toast.makeText(this,"message is $msg",Toast.LENGTH_LONG).show()

      //  var textView = findViewById(R.id.tv) as TextView


        //connecting textview
            tv.setOnClickListener(View.OnClickListener {
        //settext
            tv.setText(msg)
                //intent
           var i = Intent(this@MainActivity,Main2Activity::class.java)
//            startActivity(i)

                intent= Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.androidly.net/64/android-textview-using-kotlin"))

                startActivity(intent)



        })









    }

    override fun onBackPressed() {

        var builder=AlertDialog.Builder(this@MainActivity)
        builder.setMessage("DO U WANNA EXIT?")

        builder   .setPositiveButton("YES"){dialogInterface, i ->

            finish()
        }
        builder.setNegativeButton("NO"){DialogInterface, i->
            Toast.makeText(this@MainActivity,"message is ",Toast.LENGTH_LONG).show()

        }

        var alertDialog : AlertDialog =builder.create()
        alertDialog.show()



    }
}
