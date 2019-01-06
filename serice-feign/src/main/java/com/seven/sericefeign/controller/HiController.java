/**
 * FileName: HiController
 * Author:   wgz
 * Date:     2018-12-24 21:47
 * Description:
 * History:
 */
package com.seven.sericefeign.controller;

import com.seven.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 汪国志
 * @create 2018-12-24 21:47
 **/
@RestController
@RequestMapping(value = "hiInfo")
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
