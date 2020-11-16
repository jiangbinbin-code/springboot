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
@TableName("shibor")
public class ShiborEntity implements Serializable {
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
	private Float on;
	/**
	 * 
	 */
	private Float w1;
	/**
	 * 
	 */
	private Float w2;
	/**
	 * 
	 */
	private Float m1;
	/**
	 * 
	 */
	private Float m3;
	/**
	 * 
	 */
	private Float m6;
	/**
	 * 
	 */
	private Float m9;
	/**
	 * 
	 */
	private Float y1;

}
