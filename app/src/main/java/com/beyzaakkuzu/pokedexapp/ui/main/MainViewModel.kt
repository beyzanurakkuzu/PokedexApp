package com.beyzaakkuzu.pokedexapp.ui.main

import com.beyzaakkuzu.pokedexapp.data.repository.MainRepository
import com.skydoves.bindables.BindingViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository:MainRepository
):BindingViewModel(){
}