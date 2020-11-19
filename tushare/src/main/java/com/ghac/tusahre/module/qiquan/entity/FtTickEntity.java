package com.ghac.tusahre.module.qiquan.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-11-12 14:57:47
 */
@Data
@TableName("ft_tick")
public class FtTickEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String symbol;
	/**
	 * 
	 */
	private String tradeTime;
	/**
	 * 
	 */
	private String tradeMs;
	/**
	 * 
	 */
	private String price;
	/**
	 * 
	 */
	private String vol;
	/**
	 * 
	 */
	private String amount;
	/**
	 * 
	 */
	private String askP1;
	/**
	 * 
	 */
	private String askV1;
	/**
	 * 
	 */
	private String bidP1;
	/**
	 * 
	 */
	private String bidV1;
	/**
	 * 
	 */
	private String oi;

}
