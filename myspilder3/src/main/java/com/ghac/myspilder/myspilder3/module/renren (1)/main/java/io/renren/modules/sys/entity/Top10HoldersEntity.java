package io.renren.modules.sys.entity;

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
 * @date 2020-11-12 14:57:04
 */
@Data
@TableName("top10_holders")
public class Top10HoldersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private Float tsCode;
	/**
	 * 
	 */
	private Float annDate;
	/**
	 * 
	 */
	private Float endDate;
	/**
	 * 
	 */
	private String holderName;
	/**
	 * 
	 */
	private Float holdAmount;
	/**
	 * 
	 */
	private Float holdRatio;

}
