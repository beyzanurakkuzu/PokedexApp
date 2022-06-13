package com.beyzaakkuzu.pokedexapp.data.repository

import com.beyzaakkuzu.pokedexapp.data.data_source.dao.PokemonDao
import com.beyzaakkuzu.pokedexapp.network.PokemonClient
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val client:PokemonClient,private val dao:PokemonDao,private val ioDispatcher: CoroutineDispatcher
) : Repository
{

}