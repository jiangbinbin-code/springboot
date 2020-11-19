package com.ghac.tusahre.module.xinyejingji.entity;

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
 * @date 2020-11-12 14:58:00
 */
@Data
@TableName("bo_weekly")
public class BoWeeklyEntity implements Serializable {
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
	private String name;
	/**
	 * 
	 */
	private Float avgPrice;
	/**
	 * 
	 */
	private Float weekAmount;
	/**
	 * 
	 */
	private Float total;
	/**
	 * 
	 */
	private Integer listDay;
	/**
	 * 
	 */
	private Integer pPc;
	/**
	 * 
	 */
	private Float womIndex;
	/**
	 * 
	 */
	private Float upRatio;
	/**
	 * 
	 */
	private Integer rank;

}
