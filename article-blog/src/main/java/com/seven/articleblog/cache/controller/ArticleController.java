/**
 * FileName: ArticleController
 * Author:   wgz
 * Date:     2018-11-29 15:40
 * Description: 文章控制类
 * History:
 */
package com.seven.articleblog.cache.controller;

import com.seven.articleblog.cache.bean.EducationInfo;
import com.seven.articleblog.cache.bean.Employee;
import com.seven.articleblog.cache.service.ArticleService;
import com.seven.articleblog.multiple.annotation.DataSource;
import com.seven.articleblog.multiple.enums.DataSourceEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章控制类
 * @author 汪国志
 * @create 2018-11-29 15:40
 **/
@RestController
@RequestMapping(value = "article",name = "文章类")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    @DataSource(DataSourceEnum.DB1)
    public Employee test(@PathVariable("id")int id){
        return articleService.getEmployeeInfo(id);
    }

    @RequestMapping(value = "/testMultiple/{id}",method = RequestMethod.GET)
    @DataSource(DataSourceEnum.DB2)
    public EducationInfo testMultiple(@PathVariable("id")int id){
        return new EducationInfo().selectById(id);
        /*EducationInfo educationInfo = new EducationInfo().selectById(id);
        return educationInfo;*/
    }
}
