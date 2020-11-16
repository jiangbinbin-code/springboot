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
 * @date 2020-11-12 14:57:20
 */
@Data
@TableName("moneyflow")
public class MoneyflowEntity implements Serializable {
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
	private Integer buySmVol;
	/**
	 * 
	 */
	private Float buySmAmount;
	/**
	 * 
	 */
	private Integer sellSmVol;
	/**
	 * 
	 */
	private Float sellSmAmount;
	/**
	 * 
	 */
	private Integer buyMdVol;
	/**
	 * 
	 */
	private Float buyMdAmount;
	/**
	 * 
	 */
	private Integer sellMdVol;
	/**
	 * 
	 */
	private Float sellMdAmount;
	/**
	 * 
	 */
	private Integer buyLgVol;
	/**
	 * 
	 */
	private Float buyLgAmount;
	/**
	 * 
	 */
	private Integer sellLgVol;
	/**
	 * 
	 */
	private Float sellLgAmount;
	/**
	 * 
	 */
	private Integer buyElgVol;
	/**
	 * 
	 */
	private Float buyElgAmount;
	/**
	 * 
	 */
	private Integer sellElgVol;
	/**
	 * 
	 */
	private Float sellElgAmount;
	/**
	 * 
	 */
	private Integer netMfVol;
	/**
	 * 
	 */
	private Float netMfAmount;

}
