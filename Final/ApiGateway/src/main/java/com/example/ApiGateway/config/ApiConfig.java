package com.example.ApiGateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public RouteLocator myroute (RouteLocatorBuilder routeLocatorBuilder)
    {

        return routeLocatorBuilder.routes()
                .route(p-> p.path("/api/v1/**")
                        .uri("http://localhost:8086/"))   // user authentication

                .route(p-> p.path("/api/v2/**")
                        .uri("http://localhost:8085/")) //restaurant service

                .build();


    }
}
