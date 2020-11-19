package com.ghac.tusahre.module.gongmujijin.entity;

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
@TableName("fund_company")
public class FundCompanyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String shortname;
	/**
	 * 
	 */
	private String shortEnname;
	/**
	 * 
	 */
	private String province;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private String address;
	/**
	 * 
	 */
	private String phone;
	/**
	 * 
	 */
	private String office;
	/**
	 * 
	 */
	private String website;
	/**
	 * 
	 */
	private String chairman;
	/**
	 * 
	 */
	private String manager;
	/**
	 * 
	 */
	private Float regCapital;
	/**
	 * 
	 */
	private String setupDate;
	/**
	 * 
	 */
	private String endDate;
	/**
	 * 
	 */
	private Float employees;
	/**
	 * 
	 */
	private String mainBusiness;
	/**
	 * 
	 */
	private String orgCode;
	/**
	 * 
	 */
	private String creditCode;

}
