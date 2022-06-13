package com.beyzaakkuzu.pokedexapp.data.data_source.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.beyzaakkuzu.pokedexapp.data.data_source.dao.PokemonDao
import com.beyzaakkuzu.pokedexapp.data.data_source.dao.PokemonInfoDao
import com.beyzaakkuzu.pokedexapp.model.Pokemon
import com.beyzaakkuzu.pokedexapp.model.PokemonInfo
import com.beyzaakkuzu.pokedexapp.utils.TypeResponserConverter

@Database(
    entities = [Pokemon::class, PokemonInfo::class],
    version = 1,
    exportSchema = true)
@TypeConverters(value= [TypeResponserConverter::class])
abstract class AppDatabase :RoomDatabase() {
    abstract fun pokemonDao():PokemonDao
    abstract fun pokemonInfoDao():PokemonInfoDao
}