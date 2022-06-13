package com.beyzaakkuzu.pokedexapp.data.repository

import com.beyzaakkuzu.pokedexapp.data.data_source.dao.PokemonInfoDao
import com.beyzaakkuzu.pokedexapp.network.PokemonClient
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class DetailRepository @Inject constructor(
    private val client:PokemonClient,
    private val dao:PokemonInfoDao,
    private val ioDispatcher: CoroutineDispatcher
):Repository {
}