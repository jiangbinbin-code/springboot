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
 * @date 2020-11-12 14:57:44
 */
@Data
@TableName("forecast")
public class ForecastEntity implements Serializable {
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
	private String type;
	/**
	 * 
	 */
	private Float pChangeMin;
	/**
	 * 
	 */
	private Float pChangeMax;
	/**
	 * 
	 */
	private Float netProfitMin;
	/**
	 * 
	 */
	private Float netProfitMax;
	/**
	 * 
	 */
	private Float lastParentNet;
	/**
	 * 
	 */
	private String firstAnnDate;
	/**
	 * 
	 */
	private String summary;
	/**
	 * 
	 */
	private String changeReason;

}
