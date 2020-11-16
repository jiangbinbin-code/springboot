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
 * @date 2020-11-12 14:57:10
 */
@Data
@TableName("stk_account")
public class StkAccountEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private Float date;
	/**
	 * 
	 */
	private Float weeklyNew;
	/**
	 * 
	 */
	private Float total;
	/**
	 * 
	 */
	private Float weeklyHold;
	/**
	 * 
	 */
	private Float weeklyTrade;

}
