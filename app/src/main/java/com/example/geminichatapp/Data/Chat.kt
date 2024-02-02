package com.example.geminichatapp.Data

import android.graphics.Bitmap

data class Chat(
    val prompt:String,
    val bitmap: Bitmap?,
    val isFromUser:Boolean
)
