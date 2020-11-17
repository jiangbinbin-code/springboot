package com.ghac.myspilder.myspilder3.module.hsstock.basicdata.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:32
 */
@Data
@TableName("hs_const")
public class HsConstEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String tsCode;
	/**
	 * 
	 */
	private String hsType;
	/**
	 * 
	 */
	private String inDate;
	/**
	 * 
	 */
	private String outDate;
	/**
	 * 
	 */
	private String isNew;

}
