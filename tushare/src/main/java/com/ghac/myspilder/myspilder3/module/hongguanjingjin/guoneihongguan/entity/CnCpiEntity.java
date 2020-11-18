package com.ghac.myspilder.myspilder3.module.hongguanjingjin.guoneihongguan.entity;

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
 * @date 2020-11-12 14:57:59
 */
@Data
@TableName("cn_cpi")
public class CnCpiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String month;
	/**
	 * 
	 */
	private Float ntVal;
	/**
	 * 
	 */
	private Float ntYoy;
	/**
	 * 
	 */
	private Float ntMom;
	/**
	 * 
	 */
	private Float ntAccu;
	/**
	 * 
	 */
	private Float townVal;
	/**
	 * 
	 */
	private Float townYoy;
	/**
	 * 
	 */
	private Float townMom;
	/**
	 * 
	 */
	private Float townAccu;
	/**
	 * 
	 */
	private Float cntVal;
	/**
	 * 
	 */
	private Float cntYoy;
	/**
	 * 
	 */
	private Float cntMom;
	/**
	 * 
	 */
	private Float cntAccu;

}
