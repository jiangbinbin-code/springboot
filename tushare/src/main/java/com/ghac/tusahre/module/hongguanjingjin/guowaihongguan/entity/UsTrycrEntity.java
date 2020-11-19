package com.ghac.tusahre.module.hongguanjingjin.guowaihongguan.entity;

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
 * @date 2020-11-12 14:56:58
 */
@Data
@TableName("us_trycr")
public class UsTrycrEntity implements Serializable {
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
