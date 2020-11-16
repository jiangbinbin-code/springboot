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
 * @date 2020-11-12 14:57:43
 */
@Data
@TableName("fund_nav")
public class FundNavEntity implements Serializable {
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
	private String endDate;
	/**
	 * 
	 */
	private Float unitNav;
	/**
	 * 
	 */
	private Float accumNav;
	/**
	 * 
	 */
	private Float accumDiv;
	/**
	 * 
	 */
	private Float netAsset;
	/**
	 * 
	 */
	private Float totalNetasset;
	/**
	 * 
	 */
	private Float adjNav;

}
