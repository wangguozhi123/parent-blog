/**
 * FileName: SchedualServiceHi
 * Author:   wgz
 * Date:     2018-12-24 21:54
 * Description:
 * History:
 */
package com.seven.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author 汪国志
 * @create 2018-12-24 21:54
 **/
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface  SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
