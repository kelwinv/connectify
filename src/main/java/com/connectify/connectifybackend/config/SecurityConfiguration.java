package com.connectify.connectifybackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

  @Bean
  public SecurityFilterChain FilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(
      (authorize) -> 
        authorize
          .requestMatchers("/public/**").anonymous()
          .anyRequest().authenticated()
    );
    return http.build();
  }
}
