package com.ghac.tusahre.module.hongguanjingjin.guoneihongguan.entity;

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
@TableName("gz_index")
public class GzIndexEntity implements Serializable {
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
	private Float d10Rate;
	/**
	 * 
	 */
	private Float m1Rate;
	/**
	 * 
	 */
	private Float m3Rate;
	/**
	 * 
	 */
	private Float m6Rate;
	/**
	 * 
	 */
	private Float m12Rate;
	/**
	 * 
	 */
	private Float longRate;

}
