package com.canvas.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {

    @Bean
    public Docket api() {
    	List<ResponseMessage> responseMessageList = new ArrayList<ResponseMessage>();
    	responseMessageList.add( new ResponseMessageBuilder().code(500)
                    .message("500 message").build());
    	responseMessageList.add(new ResponseMessageBuilder().code(403)
                .message("Forbidden!!!!!").build());
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.basePackage("com.speakingclock.controller"))
            .paths(PathSelectors.ant("/clock/*"))
            .build()
            .apiInfo(apiInfo())
            .useDefaultResponseMessages(false)
            .globalResponseMessage(RequestMethod.GET,responseMessageList);
            
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("My REST API", "Some custom description of API.", "API TOS", "Terms of service", new Contact("John Doe", "www.example.com", "myeaddress@company.com"), "License of API", "API license URL", null);
        return apiInfo;
    }
} 