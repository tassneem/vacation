package org.example.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocsConfig {

    @Bean
    public OpenAPI demoAPI() {
        return new OpenAPI()
                .info(new Info().title("Demo API")
                        .description("Demo application")
                        .version("v1.1.0"));
    }
}
