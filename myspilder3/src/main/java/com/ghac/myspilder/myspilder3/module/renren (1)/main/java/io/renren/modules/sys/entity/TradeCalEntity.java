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
@TableName("trade_cal")
public class TradeCalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String exchange;
	/**
	 * 
	 */
	private String calDate;
	/**
	 * 
	 */
	private Integer isOpen;
	/**
	 * 
	 */
	private String pretradeDate;

}
