package com.rakuten.rmc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.rakuten.rmc.iam.InAppMessaging
import com.rakuten.rmc.pitari.Pitari

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.run_pitari_button).setOnClickListener {
            Toast.makeText(this, "Running testMethodPitari() ... (app module)", Toast.LENGTH_SHORT)
                .show()
            Pitari().testMethodPitari(object : Pitari.OnCompleteListener {
                override fun onComplete(isSuccess: Boolean) {
                    showAlert("Running Pitari Test Method got succeed.")
                }
            })
        }

        findViewById<Button>(R.id.run_iam_button).setOnClickListener {
            InAppMessaging().testMethodIam(this)
        }
    }

    private fun showAlert(message: String) {
        AlertDialog.Builder(this).setMessage(message).setPositiveButton("OK", null).create().show()
    }
}