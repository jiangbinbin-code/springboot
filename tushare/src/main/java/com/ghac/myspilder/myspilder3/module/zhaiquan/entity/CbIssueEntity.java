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
 * @date 2020-11-12 14:58:00
 */
@Data
@TableName("cb_issue")
public class CbIssueEntity implements Serializable {
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
	private String resAnnDate;
	/**
	 * 
	 */
	private Float planIssueSize;
	/**
	 * 
	 */
	private Float issueSize;
	/**
	 * 
	 */
	private Float issuePrice;
	/**
	 * 
	 */
	private String issueType;
	/**
	 * 
	 */
	private Float issueCost;
	/**
	 * 
	 */
	private String onlCode;
	/**
	 * 
	 */
	private String onlName;
	/**
	 * 
	 */
	private String onlDate;
	/**
	 * 
	 */
	private Float onlSize;
	/**
	 * 
	 */
	private Float onlPchVol;
	/**
	 * 
	 */
	private Integer onlPchNum;
	/**
	 * 
	 */
	private Float onlPchExcess;
	/**
	 * 
	 */
	private Float onlWinningRate;
	/**
	 * 
	 */
	private String shdRationCode;
	/**
	 * 
	 */
	private String shdRationName;
	/**
	 * 
	 */
	private String shdRationDate;
	/**
	 * 
	 */
	private String shdRationRecordDate;
	/**
	 * 
	 */
	private String shdRationPayDate;
	/**
	 * 
	 */
	private Float shdRationPrice;
	/**
	 * 
	 */
	private Float shdRationRatio;
	/**
	 * 
	 */
	private Float shdRationSize;
	/**
	 * 
	 */
	private Float shdRationVol;
	/**
	 * 
	 */
	private Integer shdRationNum;
	/**
	 * 
	 */
	private Float shdRationExcess;
	/**
	 * 
	 */
	private Float offlSize;
	/**
	 * 
	 */
	private Float offlDeposit;
	/**
	 * 
	 */
	private Float offlPchVol;
	/**
	 * 
	 */
	private Integer offlPchNum;
	/**
	 * 
	 */
	private Float offlPchExcess;
	/**
	 * 
	 */
	private Float offlWinningRate;
	/**
	 * 
	 */
	private String leadUnderwriter;
	/**
	 * 
	 */
	private Float leadUnderwriterVol;

}
