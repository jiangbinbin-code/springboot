package com.ghac.tusahre.module.waihui.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:39
 */
@Data
@TableName("fx_obasic")
public class FxObasicEntity implements Serializable {
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
	private String name;
	/**
	 * 
	 */
	private String classify;
	/**
	 * 
	 */
	private String exchange;
	/**
	 * 
	 */
	private Float minUnit;
	/**
	 * 
	 */
	private Float maxUnit;
	/**
	 * 
	 */
	private Float pip;
	/**
	 * 
	 */
	private Float pipCost;
	/**
	 * 
	 */
	private Float tragetSpread;
	/**
	 * 
	 */
	private Float minStopDistance;
	/**
	 * 
	 */
	private String tradingHours;
	/**
	 * 
	 */
	private String breakTime;

}
