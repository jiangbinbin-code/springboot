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
 * @date 2020-11-12 14:57:55
 */
@Data
@TableName("cb_price_chg")
public class CbPriceChgEntity implements Serializable {
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
	private String bondShortName;
	/**
	 * 
	 */
	private String publishDate;
	/**
	 * 
	 */
	private String changeDate;
	/**
	 * 
	 */
	private Float convertPriceInitial;
	/**
	 * 
	 */
	private Float convertpriceBef;
	/**
	 * 
	 */
	private Float convertpriceAft;

}