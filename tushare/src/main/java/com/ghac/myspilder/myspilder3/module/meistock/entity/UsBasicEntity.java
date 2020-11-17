package com.ghac.myspilder.myspilder3.module.meistock.entity;

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
 * @date 2020-11-12 14:56:59
 */
@Data
@TableName("us_basic")
public class UsBasicEntity implements Serializable {
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
	private String name;
	/**
	 * 
	 */
	private String enname;
	/**
	 * 
	 */
	private String classify;
	/**
	 * 
	 */
	private String listDate;
	/**
	 * 
	 */
	private String delistDate;

}
