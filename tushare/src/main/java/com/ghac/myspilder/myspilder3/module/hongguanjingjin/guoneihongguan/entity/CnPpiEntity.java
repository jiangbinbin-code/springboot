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
 * @date 2020-11-12 14:57:55
 */
@Data
@TableName("cn_ppi")
public class CnPpiEntity implements Serializable {
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
	private Float ppiYoy;
	/**
	 * 
	 */
	private Float ppiMpYoy;
	/**
	 * 
	 */
	private Float ppiMpQmYoy;
	/**
	 * 
	 */
	private Float ppiMpRmYoy;
	/**
	 * 
	 */
	private Float ppiMpPYoy;
	/**
	 * 
	 */
	private Float ppiCgYoy;
	/**
	 * 
	 */
	private Float ppiCgFYoy;
	/**
	 * 
	 */
	private Float ppiCgCYoy;
	/**
	 * 
	 */
	private Float ppiCgAduYoy;
	/**
	 * 
	 */
	private Float ppiCgDcgYoy;
	/**
	 * 
	 */
	private Float ppiMom;
	/**
	 * 
	 */
	private Float ppiMpMom;
	/**
	 * 
	 */
	private Float ppiMpQmMom;
	/**
	 * 
	 */
	private Float ppiMpRmMom;
	/**
	 * 
	 */
	private Float ppiMpPMom;
	/**
	 * 
	 */
	private Float ppiCgMom;
	/**
	 * 
	 */
	private Float ppiCgFMom;
	/**
	 * 
	 */
	private Float ppiCgCMom;
	/**
	 * 
	 */
	private Float ppiCgAduMom;
	/**
	 * 
	 */
	private Float ppiCgDcgMom;
	/**
	 * 
	 */
	private Float ppiAccu;
	/**
	 * 
	 */
	private Float ppiMpAccu;
	/**
	 * 
	 */
	private Float ppiMpQmAccu;
	/**
	 * 
	 */
	private Float ppiMpRmAccu;
	/**
	 * 
	 */
	private Float ppiMpPAccu;
	/**
	 * 
	 */
	private Float ppiCgAccu;
	/**
	 * 
	 */
	private Float ppiCgFAccu;
	/**
	 * 
	 */
	private Float ppiCgCAccu;
	/**
	 * 
	 */
	private Float ppiCgAduAccu;
	/**
	 * 
	 */
	private Float ppiCgDcgAccu;

}
