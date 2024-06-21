package br.com.luizgmelo.springsecurityjwt.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authenticate")
public class AuthController {

  @PostMapping
  public String authenticate() {
    return "token";
  }

}
