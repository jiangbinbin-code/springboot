package com.ghac.myspilder.myspilder3.module.news.entity;

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
 * @date 2020-11-12 14:57:48
 */
@Data
@TableName("film_record")
public class FilmRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String recNo;
	/**
	 * 
	 */
	private String filmName;
	/**
	 * 
	 */
	private String recOrg;
	/**
	 * 
	 */
	private String scriptWriter;
	/**
	 * 
	 */
	private String recResult;
	/**
	 * 
	 */
	private String recArea;
	/**
	 * 
	 */
	private String classified;
	/**
	 * 
	 */
	private String dateRange;
	/**
	 * 
	 */
	private String annDate;

}
