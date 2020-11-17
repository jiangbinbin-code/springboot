package com.ghac.myspilder.myspilder3.module.zhaiquan.entity;

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
 * @date 2020-11-12 14:57:49
 */
@Data
@TableName("eco_cal")
public class EcoCalEntity implements Serializable {
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
	private String time;
	/**
	 * 
	 */
	private String currency;
	/**
	 * 
	 */
	private String country;
	/**
	 * 
	 */
	private String event;
	/**
	 * 
	 */
	private String value;
	/**
	 * 
	 */
	private String preValue;
	/**
	 * 
	 */
	private String foreValue;

}
