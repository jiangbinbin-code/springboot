package com.ghac.tusahre.module.qihuo.entity;

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
@TableName("fut_wsr")
public class FutWsrEntity implements Serializable {
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
	private String futName;
	/**
	 * 
	 */
	private String warehouse;
	/**
	 * 
	 */
	private String whId;
	/**
	 * 
	 */
	private Integer preVol;
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
	private String area;
	/**
	 * 
	 */
	private String year;
	/**
	 * 
	 */
	private String grade;
	/**
	 * 
	 */
	private String brand;
	/**
	 * 
	 */
	private String place;
	/**
	 * 
	 */
	private Integer pd;
	/**
	 * 
	 */
	private String isCt;
	/**
	 * 
	 */
	private String unit;
	/**
	 * 
	 */
	private String exchange;

}
