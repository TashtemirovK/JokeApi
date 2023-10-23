package com.example.jokeapi.view

interface JokeView {
    fun showJoke(setup: String, punchline: String)
    fun showError(message: String)
}