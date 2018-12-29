/**
 * FileName: ArticleServiceImp
 * Author:   wgz
 * Date:     2018-12-06 11:23
 * Description:
 * History:
 */
package com.seven.articleblog.cache.service;

import com.seven.articleblog.cache.bean.EducationInfo;
import com.seven.articleblog.cache.bean.Employee;
import com.seven.articleblog.cache.mapper.EducationInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *
 * @author 汪国志
 * @create 2018-12-06 11:23
 **/
@Service
public class ArticleServiceImp implements ArticleService{
    @Autowired
    private EducationInfoMapper educationInfoMapper;

    /**
     *key = "#root.methodName+'{'+id+'}'
     */
    @Override
    @Cacheable(value = {"emp"},cacheManager = "myRedisCancheManager")
    public Employee getEmployeeInfo(int id) {
        return new Employee().selectById(id);
    }

    @Override
    public EducationInfo testMultiple(int id) {
        return educationInfoMapper.selectInfo(id);
    }


}
