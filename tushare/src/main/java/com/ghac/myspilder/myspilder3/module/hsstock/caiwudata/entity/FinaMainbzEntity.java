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
 * @date 2020-11-12 14:57:48
 */
@Data
@TableName("fina_mainbz")
public class FinaMainbzEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String tsCode;
	/**
	 * 
	 */
	private String endDate;
	/**
	 * 
	 */
	private String bzItem;
	/**
	 * 
	 */
	private Float bzSales;
	/**
	 * 
	 */
	private Float bzProfit;
	/**
	 * 
	 */
	private Float bzCost;
	/**
	 * 
	 */
	private String currType;
	/**
	 * 
	 */
	private String updateFlag;

}
