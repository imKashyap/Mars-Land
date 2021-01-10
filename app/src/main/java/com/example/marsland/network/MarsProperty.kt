package com.example.marsland.network

import com.squareup.moshi.Json

data class MarsProperty (
    val id: String,
    @Json(name = "img_src") val imgSrccUrl: String,
    val type: String,
    val price: Double){
    val isRental
        get():Boolean = type == "rent"
}