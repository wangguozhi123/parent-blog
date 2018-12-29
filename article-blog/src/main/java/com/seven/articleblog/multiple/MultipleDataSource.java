/**
 * FileName: MultipleDataSource
 * Author:   wgz
 * Date:     2018-12-27 15:01
 * Description:
 * History:
 */
package com.seven.articleblog.multiple;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 *
 * @author 汪国志
 * @create 2018-12-27 15:01
 **/
public class MultipleDataSource extends AbstractRoutingDataSource {

    /**
     * 重写determineCurrentLookupKey()，通过DataSourceContextHolder 获取数据源变量，用于当作lookupKey取出指定的数据源。
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
