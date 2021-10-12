//package com.user.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class SwaggerConfig {
//
//    /**
//     * @return Docket
//     * paths - all endpoint starting with api will only be considered
//     * apis - all api's in base package will be considered
//     */
//    @Bean
//    public Docket swaggerConfiguration() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .paths(PathSelectors.ant("/api/v1/*"))
//                .apis(RequestHandlerSelectors.basePackage("com.user"))
//                .build();
//    }
//}
////    @Bean
////    public Docket productApi() {
////        return new Docket(DocumentationType.SWAGGER_2)
////                .select()                 .apis(RequestHandlerSelectors.basePackage("guru.springframework.controllers"))
////                .paths(regex("/product.*"))
////                .build();
////}
