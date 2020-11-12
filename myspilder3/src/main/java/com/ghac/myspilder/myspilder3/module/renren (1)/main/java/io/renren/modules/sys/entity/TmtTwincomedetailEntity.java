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
 * @date 2020-11-12 14:57:05
 */
@Data
@TableName("tmt_twincomedetail")
public class TmtTwincomedetailEntity implements Serializable {
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
	private String item;
	/**
	 * 
	 */
	private String symbol;
	/**
	 * 
	 */
	private String opIncome;
	/**
	 * 
	 */
	private String consopIncome;

}
