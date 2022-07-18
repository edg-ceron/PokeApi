package com.eceron.api.pokeapi.dao;

import org.springframework.stereotype.Repository;

import com.eceron.api.pokeapi.model.UserAcess;

@Repository
public class AuthRepositoryImpl implements AuthRepository {

  @Override
  public void login(UserAcess userAcess) {
    // TODO Auto-generated method stub
    System.out.println("Entra¨****");
    
  }
}
