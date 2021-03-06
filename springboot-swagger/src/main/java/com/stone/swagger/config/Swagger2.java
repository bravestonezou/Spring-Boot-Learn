package com.stone.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/7 21:34
 * @Email zou.shiyong@frontsurf.com
 */
@Configuration
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //设置Controller类所在的包名
                .apis(RequestHandlerSelectors.basePackage("com.stone.swagger.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置文档标题
                .title("API接口文档")
                //设置文档描述
                .description("联调对接")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
