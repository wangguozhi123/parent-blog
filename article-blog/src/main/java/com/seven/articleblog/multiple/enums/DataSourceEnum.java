/**
 * FileName: DataSourceEnum
 * Author:   wgz
 * Date:     2018-12-27 15:04
 * Description: 用于存放数据源名称
 * History:
 */
package com.seven.articleblog.multiple.enums;

/**
 * 用于存放数据源名称
 * @author 汪国志
 * @create 2018-12-27 15:04
 **/
public enum  DataSourceEnum {

    DB1("db1"),DB2("db2");

    private String value;

    DataSourceEnum(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}
