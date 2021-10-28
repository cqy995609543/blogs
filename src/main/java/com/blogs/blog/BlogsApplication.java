package com.blogs.blog;

/*import org.mybatis.spring.annotation.MapperScan;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@MapperScan("com.blogs.mapper")   //扫描包，初始化注入mapper
*/

@SpringBootApplication
public class BlogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogsApplication.class, args);
    }

}
