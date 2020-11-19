package com.ghac.tusahre.module.news.entity;

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
 * @date 2020-11-12 14:57:16
 */
@Data
@TableName("news")
public class NewsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String datetime;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private String title;
	/**
	 * 
	 */
	private String channels;

}
