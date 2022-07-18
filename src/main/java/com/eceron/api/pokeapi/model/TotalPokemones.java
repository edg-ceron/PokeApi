package com.eceron.api.pokeapi.model;

import java.util.List;

public class TotalPokemones {
  private String count;
  private List<PokemoSmall> results;

  public String getCount() {
    return count;
  }
  public void setCount(String count) {
    this.count = count;
  }
  public List<PokemoSmall> getResults() {
    return results;
  }
  public void setResults(List<PokemoSmall> results) {
    this.results = results;
  }
}
