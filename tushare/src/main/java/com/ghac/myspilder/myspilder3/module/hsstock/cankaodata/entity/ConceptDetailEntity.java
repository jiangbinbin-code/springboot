package com.ghac.myspilder.myspilder3.module.hsstock.cankaodata.entity;

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
 * @date 2020-11-12 14:57:54
 */
@Data
@TableName("concept_detail")
public class ConceptDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String mid;
	/**
	 * 
	 */
	private String id;
	/**
	 * 
	 */
	private String conceptName;
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
	private String inDate;
	/**
	 * 
	 */
	private String outDate;

}
