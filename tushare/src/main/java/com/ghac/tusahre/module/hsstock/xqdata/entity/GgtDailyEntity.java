package com.ghac.tusahre.module.hsstock.xqdata.entity;

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
 * @date 2020-11-12 14:57:33
 */
@Data
@TableName("ggt_daily")
public class GgtDailyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private Float tradeDate;
	/**
	 * 
	 */
	private Float buyAmount;
	/**
	 * 
	 */
	private Float buyVolume;
	/**
	 * 
	 */
	private Float sellAmount;
	/**
	 * 
	 */
	private Float sellVolume;

}
