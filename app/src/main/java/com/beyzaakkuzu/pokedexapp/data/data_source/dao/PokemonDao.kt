package com.beyzaakkuzu.pokedexapp.data.data_source.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beyzaakkuzu.pokedexapp.model.Pokemon

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPokemonList(pokemonList:List<Pokemon>)

    @Query("Select * from Pokemon where page= :page_")
    suspend fun getPokemonList(page_:Int):List<Pokemon>

    @Query("Select * from Pokemon where page <= :page_")
    suspend fun getAllPokemonList(page_:Int):List<Pokemon>

}