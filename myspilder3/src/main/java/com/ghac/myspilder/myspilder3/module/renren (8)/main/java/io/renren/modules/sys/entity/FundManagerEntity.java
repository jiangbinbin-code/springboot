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
 * @date 2020-11-12 14:57:44
 */
@Data
@TableName("fund_manager")
public class FundManagerEntity implements Serializable {
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
	private String annDate;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String gender;
	/**
	 * 
	 */
	private String birthYear;
	/**
	 * 
	 */
	private String edu;
	/**
	 * 
	 */
	private String nationality;
	/**
	 * 
	 */
	private String beginDate;
	/**
	 * 
	 */
	private String endDate;
	/**
	 * 
	 */
	private String resume;

}
