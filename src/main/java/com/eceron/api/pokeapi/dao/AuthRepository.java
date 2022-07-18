package com.eceron.api.pokeapi.dao;

import com.eceron.api.pokeapi.model.UserAcess;

public interface AuthRepository {
  void login(UserAcess userAcess);
}
