package com.ghac.tusahre.module.zhishu.entity;

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
 * @date 2020-11-12 14:57:26
 */
@Data
@TableName("index_weight")
public class IndexWeightEntity implements Serializable {
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
	private String conCode;
	/**
	 * 
	 */
	private String tradeDate;
	/**
	 * 
	 */
	private Float weight;

}
