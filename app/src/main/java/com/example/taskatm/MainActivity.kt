package com.example.taskatm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.taskatm.Task.Bank
import com.example.taskatm.Task.User
import com.example.taskatm.Task.atm
import com.example.taskatm.Task.cheque

class MainActivity : AppCompatActivity() {

    var btnCreateAccount: Button? = null
    var btnWithdrawViaAtm: Button? = null
    var btnWithdrawViaCheck: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateAccount = findViewById(R.id.btnCreateAcnt)
        btnWithdrawViaAtm = findViewById(R.id.btnAtmWithdraw)
        btnWithdrawViaCheck = findViewById(R.id.btnChckWithdraw)

        var user = User()

        btnCreateAccount!!.setOnClickListener {
            var bank = Bank()
            bank.createAccount()
        }

        btnWithdrawViaAtm!!.setOnClickListener {
            user.withDrawCash(atm())
        }

        btnWithdrawViaCheck!!.setOnClickListener {
            user.withDrawCash(cheque())
        }
    }
}