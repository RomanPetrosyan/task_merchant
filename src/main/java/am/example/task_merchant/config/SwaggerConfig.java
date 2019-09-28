package am.example.task_merchant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("am.example.task_merchant.controller"))
        .paths(PathSelectors.any()).build().pathMapping("/")
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfo(
        "Task Spring Demo Api.",
        "Rest Endpoints for Task Spring Demo API",
        "1.0.0",
        "Terms of service",
        new Contact("Task Spring Demo", "www.example.task_merchant.am", "test@task.com"),
        "License of Task Spring Demo API", "API license URL", Collections.emptyList());
  }
}