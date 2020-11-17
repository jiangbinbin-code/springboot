package com.ghac.myspilder.myspilder3.module.zhishu.entity;

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
 * @date 2020-11-12 14:57:27
 */
@Data
@TableName("index_member")
public class IndexMemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String indexCode;
	/**
	 * 
	 */
	private String indexName;
	/**
	 * 
	 */
	private String conCode;
	/**
	 * 
	 */
	private String conName;
	/**
	 * 
	 */
	private String inDate;
	/**
	 * 
	 */
	private String outDate;
	/**
	 * 
	 */
	private String isNew;

}
