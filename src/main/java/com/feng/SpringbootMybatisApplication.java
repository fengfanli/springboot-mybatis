package com.feng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(value = {"com.feng.dao"})
@SpringBootApplication
@EnableSwagger2
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
