package io.renren.modules.sys.entity;

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
 * @date 2020-11-12 14:57:19
 */
@Data
@TableName("opt_daily")
public class OptDailyEntity implements Serializable {
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
	private String exchange;
	/**
	 * 
	 */
	private Float preSettle;
	/**
	 * 
	 */
	private Float preClose;
	/**
	 * 
	 */
	private Float open;
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
	private Float close;
	/**
	 * 
	 */
	private Float settle;
	/**
	 * 
	 */
	private Float vol;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float oi;

}
