package com.tly.base;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration//配置类
@EnableSwagger2 //swagger注解
public class SwaggerConfig {

    //此方法为swagger插件
    @Bean
    //
    public Docket webApiConfig(){
        //类型为swagger
        return new Docket(DocumentationType.SWAGGER_2)
                //自动分组
                .groupName("springCloudWebApi")
                //设置在线文档的一些信息
                .apiInfo(webApiInfo())

                //路径包含admin和error就不进行显示
                .select()
//                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    private ApiInfo webApiInfo(){
//      这些值会显示，我们等下可以看到效果
        return new ApiInfoBuilder()
                .title("springCloud")
                .description("本文档描述了springCloud接口定义")
                .version("1.0")
                .contact(new Contact("tly2", "http://tly2.com", "8974301742@qq.com"))
                .build();
    }
}
