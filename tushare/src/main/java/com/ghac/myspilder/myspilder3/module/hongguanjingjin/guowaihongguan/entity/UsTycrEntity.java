package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guowaihongguan.entity;

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
@TableName("us_tycr")
public class UsTycrEntity implements Serializable {
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
	private Float m1;
	/**
	 * 
	 */
	private Float m2;
	/**
	 * 
	 */
	private Float m3;
	/**
	 * 
	 */
	private Float m6;
	/**
	 * 
	 */
	private Float y1;
	/**
	 * 
	 */
	private Float y2;
	/**
	 * 
	 */
	private Float y3;
	/**
	 * 
	 */
	private Float y5;
	/**
	 * 
	 */
	private Float y7;
	/**
	 * 
	 */
	private Float y10;
	/**
	 * 
	 */
	private Float y20;
	/**
	 * 
	 */
	private Float y30;

}
