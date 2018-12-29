package com.seven.articleblog.cache.bean;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
/**
 * <p>
 *   已开启AR模式 * </p>
 * @作者 : 汪国志
 * @时间 : 2018-12-04
 */
@Data
@TableName("employee")
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("lastName")
	private String lastName;
	@TableField("email")
	private String email;
	@TableField("gender")
	private Integer gender;
	@TableField("d_id")
	private Integer dId;


    /**
     *  数据库字段
     */
	public static final String ID = "id";

    /**
     *  数据库字段
     */
	public static final String LASTNAME = "lastName";

    /**
     *  数据库字段
     */
	public static final String EMAIL = "email";

    /**
     *  数据库字段
     */
	public static final String GENDER = "gender";

    /**
     *  数据库字段
     */
	public static final String D_ID = "d_id";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
