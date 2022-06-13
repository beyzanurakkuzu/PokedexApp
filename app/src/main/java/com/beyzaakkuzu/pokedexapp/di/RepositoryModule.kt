package com.beyzaakkuzu.pokedexapp.di

import androidx.room.Insert
import com.beyzaakkuzu.pokedexapp.data.data_source.dao.PokemonDao
import com.beyzaakkuzu.pokedexapp.data.data_source.dao.PokemonInfoDao
import com.beyzaakkuzu.pokedexapp.data.repository.DetailRepository
import com.beyzaakkuzu.pokedexapp.data.repository.MainRepository
import com.beyzaakkuzu.pokedexapp.network.PokemonClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CloseableCoroutineDispatcher
import kotlinx.coroutines.CoroutineDispatcher

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideMainRepository(
        client: PokemonClient,
        dao: PokemonDao,
        coroutineDispatcher: CoroutineDispatcher
    ): MainRepository {
        return MainRepository(client, dao, coroutineDispatcher)
    }

    @Provides
    @ViewModelScoped
    fun provideDetailRepository(
        client: PokemonClient, dao: PokemonInfoDao,
        coroutineDispatcher: CoroutineDispatcher
    ): DetailRepository {
        return DetailRepository(client, dao, coroutineDispatcher)
    }
}