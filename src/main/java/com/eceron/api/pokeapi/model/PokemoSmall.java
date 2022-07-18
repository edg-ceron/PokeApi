package com.eceron.api.pokeapi.model;

public class PokemoSmall {
  private String name;
  private String url;
  private Integer id;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public Integer getId() {
    String[] spt = url.split("/");
    String newId = spt[spt.length-1];
    return Integer.parseInt(newId);
  }
  public void setId(Integer id) {
    this.id = id;
  }
  
}
