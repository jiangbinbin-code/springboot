package com.ghac.myspilder.myspilder3.module.news.entity;

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
 * @date 2020-11-12 14:57:04
 */
@Data
@TableName("teleplay_record")
public class TeleplayRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String classify;
	/**
	 * 
	 */
	private String types;
	/**
	 * 
	 */
	private String org;
	/**
	 * 
	 */
	private String reportDate;
	/**
	 * 
	 */
	private String licenseKey;
	/**
	 * 
	 */
	private String episodes;
	/**
	 * 
	 */
	private String shootingDate;
	/**
	 * 
	 */
	private String prodCycle;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private String proOpi;
	/**
	 * 
	 */
	private String deptOpi;
	/**
	 * 
	 */
	private String remarks;

}
