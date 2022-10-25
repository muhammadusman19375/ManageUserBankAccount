package com.example.taskatm.Task

import android.util.Log

class cheque: iWithdraw {
    override fun getAmount() {
        Log.d("TAG", "getAmount: You are using cheque")
    }
}