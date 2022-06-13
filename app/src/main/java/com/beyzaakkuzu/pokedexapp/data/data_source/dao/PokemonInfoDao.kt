package com.beyzaakkuzu.pokedexapp.data.data_source.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beyzaakkuzu.pokedexapp.model.PokemonInfo


@Dao
interface PokemonInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPokemonInfo(pokemonInfo: PokemonInfo)

    @Query("Select * from PokemonInfo where name= :name_")
    suspend fun getPokemonInfo(name_:String):PokemonDao?
}