package com.eceron.api.pokeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eceron.api.pokeapi.dao.AuthRepository;
import com.eceron.api.pokeapi.model.Token;
import com.eceron.api.pokeapi.model.UserAcess;


@RestController
@RequestMapping("AuthenticationManagement/api") 
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {
  @Autowired
	AuthRepository repositoryAuth;
  

  @PostMapping("/login")
	ResponseEntity<Token> Login (@RequestBody UserAcess userAcess) {
    // repositoryAuth.login(userAcess);
    if(!userAcess.getUser().equals("eceron")) {
      return new ResponseEntity<Token>(HttpStatus.BAD_REQUEST);
    }
    if(!userAcess.getPassword().equals("Admin123")) {
      return new ResponseEntity<Token>(HttpStatus.BAD_REQUEST);
    }

    Token token = new Token();
    token.setToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IiBFZGdhciBDZXJvbiIsImlhdCI6MTUxNjIzOTAyMn0.Bz98fdQmpey7ivbnmtRroRah6IZlcgrG-8bxuDIUIYY");
    return ResponseEntity.status(HttpStatus.OK).body(token);
	}
}
