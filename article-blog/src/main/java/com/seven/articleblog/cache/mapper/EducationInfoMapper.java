package com.seven.articleblog.cache.mapper;

import com.seven.articleblog.cache.bean.EducationInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 
 * </p>
 * @作者 : 汪国志
 * @时间 : 2018-12-27
 */
public interface EducationInfoMapper extends BaseMapper<EducationInfo> {

    EducationInfo selectInfo(int id);
}