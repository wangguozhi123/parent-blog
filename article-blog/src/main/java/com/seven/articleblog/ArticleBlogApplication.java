package com.seven.articleblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.seven.articleblog.*.mapper")
/*开启缓存的注解*/
@EnableCaching
public class ArticleBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleBlogApplication.class, args);
    }
}
