package com.beyzaakkuzu.pokedexapp.di

import com.beyzaakkuzu.pokedexapp.network.HttpRequestInterceptor
import com.beyzaakkuzu.pokedexapp.network.PokemonClient
import com.beyzaakkuzu.pokedexapp.network.PokemonService
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.security.Provider
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule
{
    @Provides
    @Singleton
    fun provideOkHttpClient():OkHttpClient{
        return OkHttpClient.Builder()
            .addInterceptor(HttpRequestInterceptor())
            .build()
    }


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    @Provides
    @Singleton
    fun providePokedexService(retrofit: Retrofit):PokemonService{
        return retrofit.create(PokemonService::class.java)
    }
    @Provides
    @Singleton
    fun providePokekexClient(pokedexService:PokemonService):PokemonClient{
        return PokemonClient(pokedexService)
    }

}