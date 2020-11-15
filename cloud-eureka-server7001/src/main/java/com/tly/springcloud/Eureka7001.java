package com.tly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

//@MapperScan("com/tly/spr/mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
//@EnableDiscoveryClient  //nacos注册，开启服务注册发现功能：
//@EnableFeignClients  //此edu要调用vod，此注解为调用者，之后用注解指定调用服务名称，定义调用的方法路径
//@EnableCaching  //开启缓存注解
//默认只会自动配置主程序的包
//除了此模块下还要扫描其他的模块的配置，这样就统一配置了
@ComponentScan("com.tly")
public class Eureka7001 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7001.class,args);
    }
}
