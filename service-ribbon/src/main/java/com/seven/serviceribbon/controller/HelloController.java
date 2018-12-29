/**
 * FileName: HelloController
 * Author:   wgz
 * Date:     2018-12-23 21:36
 * Description:
 * History:
 */
package com.seven.serviceribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author 汪国志
 * @create 2018-12-23 21:36
 **/
@RestController
@RequestMapping(value = "hello")
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "/helloTest",method = RequestMethod.GET)
    public String hi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
