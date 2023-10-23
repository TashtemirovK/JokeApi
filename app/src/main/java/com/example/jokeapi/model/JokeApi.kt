package com.example.jokeapi.model

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface JokeApi {
    @GET("random/joke")
    fun getJoke(
        @Header("X-RapidAPI-Key") key: String = "b72b475cb6msh6a657c77c266be1p13616ajsnc79f105c8084",
        @Header("X-RapidAPI-Host") host: String = "dad-jokes.p.rapidapi.com"
    ): Call<JokeModel>
}