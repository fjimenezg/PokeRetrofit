package com.example.frank.pokeretrofit.pokeapi;

import com.example.frank.pokeretrofit.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by frank on 19/05/17.
 */

public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
