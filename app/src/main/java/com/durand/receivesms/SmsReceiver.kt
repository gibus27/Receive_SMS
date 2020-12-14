package com.durand.receivesms

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.telephony.SmsMessage
import android.util.Log
import android.widget.Toast

class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        TODO("Not yet implemented")
    }
//    var messageText: String? = null
//    override fun onReceive(context: Context, intent: Intent) {
//        val extras = intent.extras
//        if (extras != null) {
//            val sms = extras.get("pdus") as Array<Any>
//
//            for (i in sms.indices) {
//                val format = extras.getString("format")
//                var smsMessage = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    SmsMessage.createFromPdu(sms[i] as ByteArray, format)
//                } else {
//                    SmsMessage.createFromPdu(sms[i] as ByteArray)
//                }
//
//                val phoneNumber = smsMessage.originatingAddress
//                 messageText = smsMessage.messageBody.toString()
//                Toast.makeText(context,"$messageText",Toast.LENGTH_SHORT).show()
//            }
//        }
//
//    }
}