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
 * @date 2020-11-12 14:57:15
 */
@Data
@TableName("pledge_detail")
public class PledgeDetailEntity implements Serializable {
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
	private String annDate;
	/**
	 * 
	 */
	private String holderName;
	/**
	 * 
	 */
	private Float pledgeAmount;
	/**
	 * 
	 */
	private String startDate;
	/**
	 * 
	 */
	private String endDate;
	/**
	 * 
	 */
	private String isRelease;
	/**
	 * 
	 */
	private String releaseDate;
	/**
	 * 
	 */
	private String pledgor;
	/**
	 * 
	 */
	private Float holdingAmount;
	/**
	 * 
	 */
	private Float pledgedAmount;
	/**
	 * 
	 */
	private Float pTotalRatio;
	/**
	 * 
	 */
	private Float hTotalRatio;
	/**
	 * 
	 */
	private String isBuyback;

}
