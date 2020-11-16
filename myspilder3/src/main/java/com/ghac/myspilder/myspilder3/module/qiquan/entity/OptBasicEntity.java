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
@TableName("opt_basic")
public class OptBasicEntity implements Serializable {
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
	private String exchange;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String perUnit;
	/**
	 * 
	 */
	private String optCode;
	/**
	 * 
	 */
	private String optType;
	/**
	 * 
	 */
	private String callPut;
	/**
	 * 
	 */
	private String exerciseType;
	/**
	 * 
	 */
	private Float exercisePrice;
	/**
	 * 
	 */
	private String sMonth;
	/**
	 * 
	 */
	private String maturityDate;
	/**
	 * 
	 */
	private Float listPrice;
	/**
	 * 
	 */
	private String listDate;
	/**
	 * 
	 */
	private String delistDate;
	/**
	 * 
	 */
	private String lastEdate;
	/**
	 * 
	 */
	private String lastDdate;
	/**
	 * 
	 */
	private String quoteUnit;
	/**
	 * 
	 */
	private String minPriceChg;

}
