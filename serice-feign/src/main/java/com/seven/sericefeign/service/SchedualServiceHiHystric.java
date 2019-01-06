/**
 * FileName: SchedualServiceHiHystric
 * Author:   wgz
 * Date:     2018-12-24 22:59
 * Description:
 * History:
 */
package com.seven.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 *
 * @author 汪国志
 * @create 2018-12-24 22:59
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
