/**
 * FileName: DataSource
 * Author:   wgz
 * Date:     2018-12-27 15:11
 * Description: 用于aop类中当作切入点来选择数据源
 * History:
 */
package com.seven.articleblog.multiple.annotation;

import com.seven.articleblog.multiple.enums.DataSourceEnum;

import java.lang.annotation.*;

/**
 * 用于aop类中当作切入点来选择数据源
 * @author 汪国志
 * @create 2018-12-27 15:11
 **/
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    DataSourceEnum value() default DataSourceEnum.DB1;
}
