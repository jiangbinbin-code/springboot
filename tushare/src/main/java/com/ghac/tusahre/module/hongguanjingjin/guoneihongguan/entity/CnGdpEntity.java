package com.ghac.tusahre.module.hongguanjingjin.guoneihongguan.entity;

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
 * @date 2020-11-12 14:57:55
 */
@Data
@TableName("cn_gdp")
public class CnGdpEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String quarter;
	/**
	 * 
	 */
	private Float gdp;
	/**
	 * 
	 */
	private Float gdpYoy;
	/**
	 * 
	 */
	private Float pi;
	/**
	 * 
	 */
	private Float piYoy;
	/**
	 * 
	 */
	private Float si;
	/**
	 * 
	 */
	private Float siYoy;
	/**
	 * 
	 */
	private Float ti;
	/**
	 * 
	 */
	private Float tiYoy;

}
