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
 * @date 2020-11-12 14:57:10
 */
@Data
@TableName("shibor_quote")
public class ShiborQuoteEntity implements Serializable {
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
	private String bank;
	/**
	 * 
	 */
	private Float onB;
	/**
	 * 
	 */
	private Float onA;
	/**
	 * 
	 */
	private Float w1B;
	/**
	 * 
	 */
	private Float w1A;
	/**
	 * 
	 */
	private Float w2B;
	/**
	 * 
	 */
	private Float w2A;
	/**
	 * 
	 */
	private Float m1B;
	/**
	 * 
	 */
	private Float m1A;
	/**
	 * 
	 */
	private Float m3B;
	/**
	 * 
	 */
	private Float m3A;
	/**
	 * 
	 */
	private Float m6B;
	/**
	 * 
	 */
	private Float m6A;
	/**
	 * 
	 */
	private Float m9B;
	/**
	 * 
	 */
	private Float m9A;
	/**
	 * 
	 */
	private Float y1B;
	/**
	 * 
	 */
	private Float y1A;

}
