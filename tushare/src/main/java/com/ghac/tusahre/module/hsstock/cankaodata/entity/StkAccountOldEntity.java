package com.ghac.tusahre.module.hsstock.cankaodata.entity;

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
 * @date 2020-11-12 14:57:11
 */
@Data
@TableName("stk_account_old")
public class StkAccountOldEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String date;
	/**
	 * 
	 */
	private Integer newSh;
	/**
	 * 
	 */
	private Integer newSz;
	/**
	 * 
	 */
	private Float activeSh;
	/**
	 * 
	 */
	private Float activeSz;
	/**
	 * 
	 */
	private Float totalSh;
	/**
	 * 
	 */
	private Float totalSz;
	/**
	 * 
	 */
	private Float tradeSh;
	/**
	 * 
	 */
	private Float tradeSz;

}
