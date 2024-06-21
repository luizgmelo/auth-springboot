# Spring Security JWT

Projeto feito para o aprendizado de Spring Security seus componentes e configurações necessárias. Esse projeto só foi possível por causa do tutorial da Giuliana Bezerra que tem um vídeo incrível ensinando como funciona cada classe e como desenvolver o projeto.

Link do repositório do projeto base: https://github.com/giuliana-bezerra/spring-security-jwt/tree/main

Tutorial apresentado [nesse vídeo](https://youtu.be/kEJ8a1w4a2Q) para ilustrar como implementar uma autenticação e autorização com Spring Security e JWT.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Security](https://spring.io/projects/spring-security)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## Como Executar
- Clonar repositório git:
```
git clone https://github.com/giuliana-bezerra/spring-security-jwt.git
```

- Construir o projeto:
```
./mvnw clean package
```

- Executar:
```
java -jar ./target/spring-security-jwt-0.0.1-SNAPSHOT.jar
```

- Testar ( com [httppie](https://httpie.io) ):
```
http -a username:password POST :8080/authenticate
JWT = <token>
http :8080/private -A bearer -a ${JWT}
```
