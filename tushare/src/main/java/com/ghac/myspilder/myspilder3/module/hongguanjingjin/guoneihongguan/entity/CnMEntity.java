package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guoneihongguan.entity;

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
@TableName("cn_m")
public class CnMEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String month;
	/**
	 * 
	 */
	private Float m0;
	/**
	 * 
	 */
	private Float m0Yoy;
	/**
	 * 
	 */
	private Float m0Mom;
	/**
	 * 
	 */
	private Float m1;
	/**
	 * 
	 */
	private Float m1Yoy;
	/**
	 * 
	 */
	private Float m1Mom;
	/**
	 * 
	 */
	private Float m2;
	/**
	 * 
	 */
	private Float m2Yoy;
	/**
	 * 
	 */
	private Float m2Mom;

}
