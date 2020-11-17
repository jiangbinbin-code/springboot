package com.ghac.myspilder.myspilder3.module.zhishu.entity;

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
 * @date 2020-11-12 14:57:54
 */
@Data
@TableName("daily_info")
public class DailyInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String tradeDate;
	/**
	 * 
	 */
	private String tsCode;
	/**
	 * 
	 */
	private String tsName;
	/**
	 * 
	 */
	private Integer comCount;
	/**
	 * 
	 */
	private Float totalShare;
	/**
	 * 
	 */
	private Float floatShare;
	/**
	 * 
	 */
	private Float totalMv;
	/**
	 * 
	 */
	private Float floatMv;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float vol;
	/**
	 * 
	 */
	private Integer transCount;
	/**
	 * 
	 */
	private Float pe;
	/**
	 * 
	 */
	private Float tr;
	/**
	 * 
	 */
	private String exchange;

}
