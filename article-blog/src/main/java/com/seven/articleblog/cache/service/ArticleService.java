/**
 * FileName: ArticleService
 * Author:   wgz
 * Date:     2018-12-06 11:22
 * Description:
 * History:
 */
package com.seven.articleblog.cache.service;

import com.seven.articleblog.cache.bean.EducationInfo;
import com.seven.articleblog.cache.bean.Employee;

/**
 *
 * @author 汪国志
 * @create 2018-12-06 11:22
 **/
public interface ArticleService {
    Employee getEmployeeInfo(int id);

    EducationInfo testMultiple(int id);
}
