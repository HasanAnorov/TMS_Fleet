package com.example.tmsfleet.di

import com.example.tmsfleet.networking.NetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    const val baseUrl = "http://base_url"

    @Singleton
    @Provides
    fun provideNetworkService(retrofit: Retrofit):NetworkService{
       return retrofit.create(NetworkService::class.java)
    }

    @Singleton
    @Provides
    fun getRetrofit():Retrofit{
        return  Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}