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
 * @date 2020-11-12 14:57:15
 */
@Data
@TableName("pledge_stat")
public class PledgeStatEntity implements Serializable {
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
	private Integer pledgeCount;
	/**
	 * 
	 */
	private Float unrestPledge;
	/**
	 * 
	 */
	private Float restPledge;
	/**
	 * 
	 */
	private Float totalShare;
	/**
	 * 
	 */
	private Float pledgeRatio;

}
