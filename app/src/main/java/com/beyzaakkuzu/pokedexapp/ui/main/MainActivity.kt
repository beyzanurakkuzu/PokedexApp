package com.beyzaakkuzu.pokedexapp.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.annotation.VisibleForTesting
import com.beyzaakkuzu.pokedexapp.R
import com.beyzaakkuzu.pokedexapp.adapter.PokemonAdapter
import com.beyzaakkuzu.pokedexapp.databinding.ActivityMainBinding
import com.skydoves.bindables.BindingActivity
import com.skydoves.transformationlayout.onTransformationStartContainer
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    @get:VisibleForTesting
    internal val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        onTransformationStartContainer()
        super.onCreate(savedInstanceState)
        binding{
            adapter = PokemonAdapter()
            vm= viewModel
        }
    }
}