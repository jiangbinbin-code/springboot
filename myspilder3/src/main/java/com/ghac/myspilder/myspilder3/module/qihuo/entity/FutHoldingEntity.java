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
 * @date 2020-11-12 14:57:39
 */
@Data
@TableName("fut_holding")
public class FutHoldingEntity implements Serializable {
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
	private String symbol;
	/**
	 * 
	 */
	private String broker;
	/**
	 * 
	 */
	private Integer vol;
	/**
	 * 
	 */
	private Integer volChg;
	/**
	 * 
	 */
	private Integer longHld;
	/**
	 * 
	 */
	private Integer longChg;
	/**
	 * 
	 */
	private Integer shortHld;
	/**
	 * 
	 */
	private Integer shortChg;
	/**
	 * 
	 */
	private String exchange;

}