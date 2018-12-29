package com.seven.articleblog.cache.bean;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * <p>
 *   已开启AR模式 * </p>
 * @作者 : 汪国志
 * @时间 : 2018-12-27
 */
@Data
@Accessors(chain = true)
@TableName("nh_ri_education_info")
public class EducationInfo extends Model<EducationInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 健教专干姓名
     */
	@TableField("education_name")
	private String educationName;
    /**
     * 健教专干电话
     */
	@TableField("education_phone")
	private String educationPhone;
    /**
     * 机构id
     */
	@TableField("org_id")
	private Long orgId;
    /**
     * 机构空间id
     */
	@TableField("community_id")
	private String communityId;
    /**
     * 是否有公众号（0没有 1有）
     */
	@TableField("exist_wechat")
	private Long existWechat;
    /**
     * 公众号类型（0订阅号 1服务号）
     */
	@TableField("category_wechat")
	private Long categoryWechat;
    /**
     * 是否注册后台账号（0未注册 1已注册）
     */
	@TableField("is_register")
	private Long isRegister;
    /**
     * 是否已认领（0未认领 1已认领）
     */
	@TableField("is_confirm")
	private Long isConfirm;


    /**
     *  主键数据库字段
     */
	public static final String ID = "id";

    /**
     *  健教专干姓名数据库字段
     */
	public static final String EDUCATION_NAME = "education_name";

    /**
     *  健教专干电话数据库字段
     */
	public static final String EDUCATION_PHONE = "education_phone";

    /**
     *  机构id数据库字段
     */
	public static final String ORG_ID = "org_id";

    /**
     *  机构空间id数据库字段
     */
	public static final String COMMUNITY_ID = "community_id";

    /**
     *  是否有公众号（0没有 1有）数据库字段
     */
	public static final String EXIST_WECHAT = "exist_wechat";

    /**
     *  公众号类型（0订阅号 1服务号）数据库字段
     */
	public static final String CATEGORY_WECHAT = "category_wechat";

    /**
     *  是否注册后台账号（0未注册 1已注册）数据库字段
     */
	public static final String IS_REGISTER = "is_register";

    /**
     *  是否已认领（0未认领 1已认领）数据库字段
     */
	public static final String IS_CONFIRM = "is_confirm";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
