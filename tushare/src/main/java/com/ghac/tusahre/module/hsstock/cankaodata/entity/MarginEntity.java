package com.ghac.tusahre.module.hsstock.cankaodata.entity;

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
 * @date 2020-11-12 14:57:20
 */
@Data
@TableName("margin")
public class MarginEntity implements Serializable {
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
	private String exchangeId;
	/**
	 * 
	 */
	private Float rzye;
	/**
	 * 
	 */
	private Float rzmre;
	/**
	 * 
	 */
	private Float rzche;
	/**
	 * 
	 */
	private Float rqye;
	/**
	 * 
	 */
	private Float rqmcl;
	/**
	 * 
	 */
	private Float rzrqye;
	/**
	 * 
	 */
	private Float rqyl;

}
