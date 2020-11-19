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
 * @date 2020-11-12 14:56:58
 */
@Data
@TableName("wz_index")
public class WzIndexEntity implements Serializable {
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
	private Float compRate;
	/**
	 * 
	 */
	private Float centerRate;
	/**
	 * 
	 */
	private Float microRate;
	/**
	 * 
	 */
	private Float cmRate;
	/**
	 * 
	 */
	private Float sdbRate;
	/**
	 * 
	 */
	private Float omRate;
	/**
	 * 
	 */
	private Float aaRate;
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
