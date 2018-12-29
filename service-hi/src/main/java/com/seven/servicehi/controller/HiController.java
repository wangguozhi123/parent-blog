/**
 * FileName: HiController
 * Author:   wgz
 * Date:     2018-12-23 20:58
 * Description:
 * History:
 */
package com.seven.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 汪国志
 * @create 2018-12-23 20:58
 **/
@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String test(String name){
        return "hi " + name + " ,i am from port:" + port;
    }
}
