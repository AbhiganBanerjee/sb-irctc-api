package in.ashokit.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	
	//Create a method to generate documentation using Docket
	//This will generate documentation for the in.ashokit.rest package classes
	public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
            .group("ashokit-public")
            .packagesToScan("in.ashokit.rest")
            .build();
    }
}	

