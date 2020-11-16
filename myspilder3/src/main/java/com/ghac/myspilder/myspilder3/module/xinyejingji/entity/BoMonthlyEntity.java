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
 * @date 2020-11-12 14:58:00
 */
@Data
@TableName("bo_monthly")
public class BoMonthlyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String date;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String listDate;
	/**
	 * 
	 */
	private Float avgPrice;
	/**
	 * 
	 */
	private Float monthAmount;
	/**
	 * 
	 */
	private Integer listDay;
	/**
	 * 
	 */
	private Integer pPc;
	/**
	 * 
	 */
	private Float womIndex;
	/**
	 * 
	 */
	private Float mRatio;
	/**
	 * 
	 */
	private Integer rank;

}
