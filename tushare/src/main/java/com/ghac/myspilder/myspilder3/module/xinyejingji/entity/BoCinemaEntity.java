package com.ghac.myspilder.myspilder3.module.xinyejingji.entity;

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
 * @date 2020-11-12 14:58:04
 */
@Data
@TableName("bo_cinema")
public class BoCinemaEntity implements Serializable {
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
	private String cName;
	/**
	 * 
	 */
	private Integer audCount;
	/**
	 * 
	 */
	private Float attRatio;
	/**
	 * 
	 */
	private Float dayAmount;
	/**
	 * 
	 */
	private Float dayShowcount;
	/**
	 * 
	 */
	private Float avgPrice;
	/**
	 * 
	 */
	private Float pPc;
	/**
	 * 
	 */
	private Integer rank;

}
