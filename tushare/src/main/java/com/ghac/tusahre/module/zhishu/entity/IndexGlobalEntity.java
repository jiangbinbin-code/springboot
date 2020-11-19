package com.ghac.tusahre.module.zhishu.entity;

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
 * @date 2020-11-12 14:57:27
 */
@Data
@TableName("index_global")
public class IndexGlobalEntity implements Serializable {
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
	private Float open;
	/**
	 * 
	 */
	private Float close;
	/**
	 * 
	 */
	private Float high;
	/**
	 * 
	 */
	private Float low;
	/**
	 * 
	 */
	private Float preClose;
	/**
	 * 
	 */
	private Float change;
	/**
	 * 
	 */
	private Float pctChg;
	/**
	 * 
	 */
	private Float swing;
	/**
	 * 
	 */
	private Float vol;
	/**
	 * 
	 */
	private Float amount;

}
