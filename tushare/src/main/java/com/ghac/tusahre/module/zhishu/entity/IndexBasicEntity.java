package com.ghac.tusahre.module.zhishu.entity;

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
 * @date 2020-11-12 14:57:27
 */
@Data
@TableName("index_basic")
public class IndexBasicEntity implements Serializable {
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
	private String fullname;
	/**
	 * 
	 */
	private String market;
	/**
	 * 
	 */
	private String publisher;
	/**
	 * 
	 */
	private String indexType;
	/**
	 * 
	 */
	private String category;
	/**
	 * 
	 */
	private String baseDate;
	/**
	 * 
	 */
	private Float basePoint;
	/**
	 * 
	 */
	private String listDate;
	/**
	 * 
	 */
	private String weightRule;
	/**
	 * 
	 */
	private String desc;
	/**
	 * 
	 */
	private String expDate;

}
