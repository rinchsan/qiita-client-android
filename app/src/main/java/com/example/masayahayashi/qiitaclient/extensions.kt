package com.example.masayahayashi.qiitaclient

import android.content.Context
import android.widget.Toast

/**
 * Created by masayahayashi on 2017/11/06.
 */

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
