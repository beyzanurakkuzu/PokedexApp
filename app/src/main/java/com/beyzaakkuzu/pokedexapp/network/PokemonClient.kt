package com.beyzaakkuzu.pokedexapp.network

import com.beyzaakkuzu.pokedexapp.model.PokemonInfo
import com.beyzaakkuzu.pokedexapp.model.PokemonResponse
import com.skydoves.sandwich.ApiResponse
import javax.inject.Inject

class PokemonClient @Inject constructor(
    private val service:PokemonService
) {

    suspend fun fetchPokemonList(
        page:Int
    ):ApiResponse<PokemonResponse> = service.fetchPokemonList(limit = PAGING_SIZE,offset= page *PAGING_SIZE)

    suspend fun fetchPokemonInfo(name:String):ApiResponse<PokemonInfo> = service.fetchPokemonInfo(name=name)

    companion object{
        private const val PAGING_SIZE=20
    }
}