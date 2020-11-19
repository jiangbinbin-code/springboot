package com.ghac.tusahre.module.waihui.entity;

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
 * @date 2020-11-12 14:57:39
 */
@Data
@TableName("fx_daily")
public class FxDailyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String tsCode;
	/**
	 * 
	 */
	private String tradeDate;
	/**
	 * 
	 */
	private Float bidOpen;
	/**
	 * 
	 */
	private Float bidClose;
	/**
	 * 
	 */
	private Float bidHigh;
	/**
	 * 
	 */
	private Float bidLow;
	/**
	 * 
	 */
	private Float askOpen;
	/**
	 * 
	 */
	private Float askClose;
	/**
	 * 
	 */
	private Float askHigh;
	/**
	 * 
	 */
	private Float askLow;
	/**
	 * 
	 */
	private Integer tickQty;
	/**
	 * 
	 */
	private String exchange;

}
