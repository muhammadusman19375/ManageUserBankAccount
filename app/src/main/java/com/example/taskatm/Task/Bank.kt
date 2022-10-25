package com.example.taskatm.Task

import android.util.Log

class Bank: iCreateAccount {
    override fun createAccount() {
        Log.d("TAG", "createAccount: Account is creating")
    }
}