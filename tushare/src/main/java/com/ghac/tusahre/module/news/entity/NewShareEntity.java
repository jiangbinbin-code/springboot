package com.ghac.tusahre.module.news.entity;

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
 * @date 2020-11-12 14:57:16
 */
@Data
@TableName("new_share")
public class NewShareEntity implements Serializable {
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
	private String subCode;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String ipoDate;
	/**
	 * 
	 */
	private String issueDate;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float marketAmount;
	/**
	 * 
	 */
	private Float price;
	/**
	 * 
	 */
	private Float pe;
	/**
	 * 
	 */
	private Float limitAmount;
	/**
	 * 
	 */
	private Float funds;
	/**
	 * 
	 */
	private Float ballot;

}
