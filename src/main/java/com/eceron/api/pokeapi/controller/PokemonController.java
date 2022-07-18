package com.eceron.api.pokeapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eceron.api.pokeapi.model.PokemonDetail;
import com.eceron.api.pokeapi.model.TotalPokemones;

@RestController
@RequestMapping("PokemonManagement/api/pokemon") 
@CrossOrigin(origins = "http://localhost:3000")
public class PokemonController {

  @Value("${api.pokemon}")
	private String apiPokemon;

  @GetMapping("/list")
	ResponseEntity<TotalPokemones> GetListPokemon (
    @RequestParam(name = "limit", defaultValue = "12") Integer limit,
    @RequestParam(name = "offset", defaultValue = "0") Integer offset
  ) {
    String url = apiPokemon +"/pokemon?limit=" + limit + "&offset=" + offset;
    RestTemplate restTemplate = new RestTemplate();
    TotalPokemones result = restTemplate.getForObject(url, TotalPokemones.class);
    return ResponseEntity.status(HttpStatus.OK).body(result);
	}


  @GetMapping("/{id}")
	ResponseEntity<PokemonDetail> DetailPokemon (
    @PathVariable(name = "id", required = true) Integer id
  ) {
    String url = apiPokemon + "/pokemon/" + id;
    RestTemplate restTemplate = new RestTemplate();
    PokemonDetail result = restTemplate.getForObject(url, PokemonDetail.class);
    return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}
