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
 * @date 2020-11-12 14:58:04
 */
@Data
@TableName("block_trade")
public class BlockTradeEntity implements Serializable {
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
	private String tradeDate;
	/**
	 * 
	 */
	private Float price;
	/**
	 * 
	 */
	private Float vol;
	/**
	 * 
	 */
	private Float amount;
	/**
	 * 
	 */
	private String buyer;
	/**
	 * 
	 */
	private String seller;

}
