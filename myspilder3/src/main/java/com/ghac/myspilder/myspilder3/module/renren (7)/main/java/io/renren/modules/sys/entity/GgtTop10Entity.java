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
 * @date 2020-11-12 14:57:38
 */
@Data
@TableName("ggt_top10")
public class GgtTop10Entity implements Serializable {
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
	private String name;
	/**
	 * 
	 */
	private Float close;
	/**
	 * 
	 */
	private Float pChange;
	/**
	 * 
	 */
	private String rank;
	/**
	 * 
	 */
	private String marketType;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float netAmount;
	/**
	 * 
	 */
	private Float shAmount;
	/**
	 * 
	 */
	private Float shNetAmount;
	/**
	 * 
	 */
	private Float shBuy;
	/**
	 * 
	 */
	private Float shSell;
	/**
	 * 
	 */
	private Float szAmount;
	/**
	 * 
	 */
	private Float szNetAmount;
	/**
	 * 
	 */
	private Float szBuy;
	/**
	 * 
	 */
	private Float szSell;

}
