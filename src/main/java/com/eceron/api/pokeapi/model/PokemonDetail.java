package com.eceron.api.pokeapi.model;

import java.util.List;

public class PokemonDetail {
  private Integer id;
  private String name;
  private Object sprites;
  private List<Object> types;
  private Integer base_experience;
  private List<Object> stats;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Object getSprites() {
    return sprites;
  }
  public void setSprites(Object sprites) {
    this.sprites = sprites;
  }
  public List<Object> getTypes() {
    return types;
  }
  public void setTypes(List<Object> types) {
    this.types = types;
  }
  public Integer getBase_experience() {
    return base_experience;
  }
  public void setBase_experience(Integer base_experience) {
    this.base_experience = base_experience;
  }
  public List<Object> getStats() {
    return stats;
  }
  public void setStats(List<Object> stats) {
    this.stats = stats;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

}
