/**
 * FileName: KeyGenerator
 * Author:   wgz
 * Date:     2018-12-09 21:06
 * Description:
 * History:
 */
package com.seven.articleblog.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *
 * @author 汪国志
 * @create 2018-12-09 21:06
 **/
@Configuration
 class CacheConifg {
    @Bean("myGenerator")
    public KeyGenerator keyGenerator(){
        return new KeyGenerator(){

            @Override
            public Object generate(Object o, Method method, Object... objects) {
                return method.getName()+"{"+ Arrays.asList(objects).toString() +"}";
            }
        };
    }
}
