package com.ghac.myspilder.myspilder3.module.zhaiquan.entity;

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
 * @date 2020-11-12 14:57:59
 */
@Data
@TableName("cb_share")
public class CbShareEntity implements Serializable {
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
	private String bondShortName;
	/**
	 * 
	 */
	private String publishDate;
	/**
	 * 
	 */
	private String endDate;
	/**
	 * 
	 */
	private Float issueSize;
	/**
	 * 
	 */
	private Float convertPriceInitial;
	/**
	 * 
	 */
	private Float convertPrice;
	/**
	 * 
	 */
	private Float convertVal;
	/**
	 * 
	 */
	private Float convertVol;
	/**
	 * 
	 */
	private Float convertRatio;
	/**
	 * 
	 */
	private Float accConvertVal;
	/**
	 * 
	 */
	private Float accConvertVol;
	/**
	 * 
	 */
	private Float accConvertRatio;
	/**
	 * 
	 */
	private Float remainSize;
	/**
	 * 
	 */
	private Float totalShares;

}
