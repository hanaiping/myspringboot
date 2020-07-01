package com.hap.demo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger文档
 * 认证系统
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

    //在配置好的配置类中增加此段代码即可
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        //name表示名称，description表示描述
        ticketPar.name("Authorization").description("登录校验")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false)
                //required表示是否必填，defaultvalue表示默认值
                .defaultValue("Bearer ")
                .build();
        //添加完此处一定要把下边的带***的也加上否则不生效
        pars.add(ticketPar.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //这里采用包含注解的方式来确定要显示的接口
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //这里采用包扫描的方式来确定要显示的接口
                //.apis(RequestHandlerSelectors.basePackage("com.stylefeng.guns.modular.system.controller"))
                .paths(PathSelectors.any())
                .build()
                //************把消息头添加
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger接口文档")
                .description("swagger接口文档")
                .termsOfServiceUrl("")
                .contact(new Contact("aiping", "", "zkyhap@163.com"))
                .version("1.0")
                .build();
    }

 /*   @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("MCN认证swagger接口文档")
                .apiInfo(new ApiInfoBuilder().title("MCN认证swagger接口文档")
                        .contact(new Contact("liujiajun", "", "381245163@qq.com")).version("1.0").build())
                .select().paths(PathSelectors.any()).build();
    }*/
}
