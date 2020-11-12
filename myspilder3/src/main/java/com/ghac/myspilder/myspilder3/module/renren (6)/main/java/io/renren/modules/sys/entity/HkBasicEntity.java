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
 * @date 2020-11-12 14:57:33
 */
@Data
@TableName("hk_basic")
public class HkBasicEntity implements Serializable {
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
	private String name;
	/**
	 * 
	 */
	private String fullname;
	/**
	 * 
	 */
	private String enname;
	/**
	 * 
	 */
	private String cnSpell;
	/**
	 * 
	 */
	private String market;
	/**
	 * 
	 */
	private String listStatus;
	/**
	 * 
	 */
	private String listDate;
	/**
	 * 
	 */
	private String delistDate;
	/**
	 * 
	 */
	private Float tradeUnit;
	/**
	 * 
	 */
	private String isin;
	/**
	 * 
	 */
	private String currType;

}
