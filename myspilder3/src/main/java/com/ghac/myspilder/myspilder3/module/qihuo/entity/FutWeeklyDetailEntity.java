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
@TableName("fut_weekly_detail")
public class FutWeeklyDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String exchange;
	/**
	 * 
	 */
	private String prd;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Integer vol;
	/**
	 * 
	 */
	private Float volYoy;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private Float amoutYoy;
	/**
	 * 
	 */
	private Integer cumvol;
	/**
	 * 
	 */
	private Float cumvolYoy;
	/**
	 * 
	 */
	private Float cumamt;
	/**
	 * 
	 */
	private Float cumamtYoy;
	/**
	 * 
	 */
	private Integer openInterest;
	/**
	 * 
	 */
	private Float interestWow;
	/**
	 * 
	 */
	private Float mcClose;
	/**
	 * 
	 */
	private Float closeWow;
	/**
	 * 
	 */
	private String week;
	/**
	 * 
	 */
	private String weekDate;

}
