package cl.previred.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Autowired
	private Environment env;

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("cl.previred.rest"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo())
				;
	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
        		.title(env.getProperty("swagger.title"))
        		.description(env.getProperty("swagger.description"))
        		.version(env.getProperty("swagger.version")).build();
    }
	
	

}