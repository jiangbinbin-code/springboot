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
 * @date 2020-11-12 14:56:59
 */
@Data
@TableName("us_tbr")
public class UsTbrEntity implements Serializable {
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
	private Float w4Bd;
	/**
	 * 
	 */
	private Float w4Ce;
	/**
	 * 
	 */
	private Float w8Bd;
	/**
	 * 
	 */
	private Float w8Ce;
	/**
	 * 
	 */
	private Float w13Bd;
	/**
	 * 
	 */
	private Float w13Ce;
	/**
	 * 
	 */
	private Float w26Bd;
	/**
	 * 
	 */
	private Float w26Ce;
	/**
	 * 
	 */
	private Float w52Bd;
	/**
	 * 
	 */
	private Float w52Ce;

}
