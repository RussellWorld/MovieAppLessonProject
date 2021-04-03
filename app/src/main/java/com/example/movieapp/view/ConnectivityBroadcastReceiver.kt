package com.example.movieapp.view

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import java.lang.StringBuilder

class ConnectivityBroadcastReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        StringBuilder().apply {
            append("Сообщение от системы\n")
            append("Action: ${intent.action}")
            Toast.makeText(context, this.toString(), Toast.LENGTH_LONG).show()
        }
    }
}