package com.blog.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * swagger配置
 * 访问 http://127.0.0.1:8080/swagger-ui/index.html
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    Boolean swaggerEnabled = true;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                // 是否开启
                .enable(swaggerEnabled)// true
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.blog.backend"))  // 指定扫描的包
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("(后端)博客系统")
                // 创建人
                .contact(new Contact("adekang", "https://github.com/adekang", "adekang@163.com"))
                .version("1.0")
                .description("不需要描述")
                .build();
    }
}
