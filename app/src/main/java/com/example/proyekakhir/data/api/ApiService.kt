package com.example.proyekakhir.data.api

import com.example.proyekakhir.data.model.ListResponse
import com.example.proyekakhir.data.model.MovieResponse
import com.example.proyekakhir.data.model.TvShowResponse
import com.example.proyekakhir.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}