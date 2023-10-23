package com.example.jokeapi

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.jokeapi.databinding.ActivityMainBinding
import com.example.jokeapi.presenter.Presenter
import com.example.jokeapi.view.JokeView

class MainActivity : AppCompatActivity(), JokeView {

    private lateinit var binding: ActivityMainBinding

    private val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.btnJoke.setOnClickListener {
            presenter.getJokeResult()
        }
    }

    override fun showJoke(setup: String, punchline: String) {
        binding.tvSetup.text = setup
        binding.tvPunchline.text = punchline
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}