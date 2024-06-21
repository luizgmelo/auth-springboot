package br.com.luizgmelo.springsecurityjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luizgmelo.springsecurityjwt.security.AuthenticationService;

@RestController
@RequestMapping("authenticate")
public class AuthController {
  @Autowired
  private AuthenticationService authenticationService;

  @PostMapping
  public String authenticate(Authentication authentication) {
    return authenticationService.authenticate(authentication);
  }

}
