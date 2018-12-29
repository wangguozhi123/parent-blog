/**
 * FileName: DataSourceAspect
 * Author:   wgz
 * Date:     2018-12-27 15:21
 * Description:
 * History:
 */
package com.seven.articleblog.multiple.aop;


import com.seven.articleblog.multiple.DataSourceContextHolder;
import com.seven.articleblog.multiple.annotation.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author 汪国志
 * @create 2018-12-27 15:21
 **/
@Component
@Slf4j
@Aspect
@Order(-1)
public class DataSourceAspect {

    @Pointcut("@within(com.seven.articleblog.multiple.annotation.DataSource) || @annotation(com.seven.articleblog.multiple.annotation.DataSource)")
    public void pointCut(){

    }

    @Before("pointCut() && @annotation(dataSource)")
    public void doBefore(DataSource dataSource){
        log.info("选择数据源---"+dataSource.value().getValue());
        DataSourceContextHolder.setDataSource(dataSource.value().getValue());
    }

    @After("pointCut()")
    public void doAfter(){
        DataSourceContextHolder.clear();
    }
}
