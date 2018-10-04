/**
 * 
 */
package com.bridgelabz.eureka.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:JobSkills pojo
 */
@Document(collection="jobSkills")
public class JobSkills {

	@Id
	@ApiModelProperty(hidden=true)
	private String jobskillId;
	
	private String jobskillName;
	
	private String lastUpdatedTime;
	/**
	 * @return the jobskillId
	 */
	public String getJobskillId() {
		return jobskillId;
	}

	/**
	 * @param list the jobskillId to set
	 */
	public void setJobskillId(String list) {
		this.jobskillId = list;
	}

	/**
	 * @return the jobskillName
	 */
	public String getJobskillName() {
		return jobskillName;
	}

	/**
	 * @param jobskillName the jobskillName to set
	 */
	public void setJobskillName(String jobskillName) {
		this.jobskillName = jobskillName;
	}

	/**
	 * @return the lastUpdatedTime
	 */
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	/**
	 * @param lastUpdatedTime the lastUpdatedTime to set
	 */
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	
	}

}
