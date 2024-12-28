package com.miqueias.dslist_workshop_ds.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API REST com Spring Boot")
                        .version("1.0.0")
                        .description("API do Intensivão de Desenvolvimento com Spring Boot do Nélio Alves"));
    }
}