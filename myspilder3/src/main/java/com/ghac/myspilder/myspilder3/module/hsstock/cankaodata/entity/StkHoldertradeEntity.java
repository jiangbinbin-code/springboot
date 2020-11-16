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
 * @date 2020-11-12 14:57:10
 */
@Data
@TableName("stk_holdertrade")
public class StkHoldertradeEntity implements Serializable {
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
	private String holderType;
	/**
	 * 
	 */
	private String inDe;
	/**
	 * 
	 */
	private Float changeVol;
	/**
	 * 
	 */
	private Float changeRatio;
	/**
	 * 
	 */
	private Float afterShare;
	/**
	 * 
	 */
	private Float afterRatio;
	/**
	 * 
	 */
	private Float avgPrice;
	/**
	 * 
	 */
	private Float totalShare;
	/**
	 * 
	 */
	private String beginDate;
	/**
	 * 
	 */
	private String closeDate;

}
