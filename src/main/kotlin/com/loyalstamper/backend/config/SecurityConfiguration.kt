package com.loyalstamper.backend.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.server.SecurityWebFilterChain

//a quick teaser of securconfig of webflux
@Configuration
@EnableWebFluxSecurity
class SecurityConfiguration {
    @Bean
    fun filterChain(httpSecurity: ServerHttpSecurity): SecurityWebFilterChain {
        httpSecurity.authorizeExchange() {
            it.pathMatchers("/api/**").permitAll()
//            we do that for now
it.pathMatchers("**").permitAll()
          }
      return httpSecurity.build()
    }
}