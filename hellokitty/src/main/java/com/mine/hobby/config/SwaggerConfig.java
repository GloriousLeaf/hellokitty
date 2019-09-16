package com.mine.hobby.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zengnian
 * @date 2019/9/12 14:57
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

   @Bean
   public Docket createRestApi() {
      return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
             .select()
             .apis(RequestHandlerSelectors.basePackage("com.mine.hobby.controller"))
             .paths(PathSelectors.any()).build();
   }

   private ApiInfo apiInfo() {
      return new ApiInfoBuilder()
             .title("test Swagger REST APIs")//标题
             .description("Swagger API 服务")//标题
             .termsOfServiceUrl("http://swagger.io/")//（不可见）条款地址，公司内部使用的话不需要配
             .contact(new Contact("zengnian", "127.0.0.1", ""))//作者信息
             .version("1.0")//版本号
             .build();

   }
}
