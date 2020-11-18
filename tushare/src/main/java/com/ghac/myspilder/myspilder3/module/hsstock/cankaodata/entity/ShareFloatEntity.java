package com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.entity;

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
 * @date 2020-11-12 14:57:15
 */
@Data
@TableName("share_float")
public class ShareFloatEntity implements Serializable {
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
	private String annDate;
	/**
	 * 
	 */
	private String floatDate;
	/**
	 * 
	 */
	private Float floatShare;
	/**
	 * 
	 */
	private Float floatRatio;
	/**
	 * 
	 */
	private String holderName;
	/**
	 * 
	 */
	private String shareType;

}
