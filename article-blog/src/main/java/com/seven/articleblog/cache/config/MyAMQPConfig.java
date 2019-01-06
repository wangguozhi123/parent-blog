/**
 * FileName: MyAMQPConfig
 * Author:   wgz
 * Date:     2019-01-02 22:43
 * Description: 自定义rabbitMq序列号
 * History:
 */
package com.seven.articleblog.cache.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义rabbitMq序列号
 * @author 汪国志
 * @create 2019-01-02 22:43
 **/
@Configuration
public class MyAMQPConfig {

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
