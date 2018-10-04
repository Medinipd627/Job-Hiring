/**
 * 
 */
package com.bridgelabz.eureka.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;


/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:Pojo for job
 */
@Document(collection="job")
public class Job {

	@Id  
	@ApiModelProperty(hidden = true)
	private String jobPostId;

	@NotNull
	private String job_role;
	@NotNull
	private String job_title;
	@NotNull
	private String job_type;
	@NotNull
	private String exp_req;
	@NotNull
	private String sal_max;
	@NotNull
	private String sal_min;
	@NotNull
	private List<String> listoflocationId=new ArrayList<>();
	@NotNull
	private List<String> listofjobskillsId=new ArrayList<>();
	@NotNull
	@ApiModelProperty(hidden = true)
	private String lastUpdatedDate;

	/**
	 * @return the jobPostId
	 */
	public String getJobPostId() {
		return jobPostId;
	}

	/**
	 * @param jobPostId the jobPostId to set
	 */
	public void setJobPostId(String jobPostId) {
		this.jobPostId = jobPostId;
	}

	/**
	 * @return the job_role
	 */
	public String getJob_role() {
		return job_role;
	}

	/**
	 * @param job_role the job_role to set
	 */
	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	/**
	 * @return the job_title
	 */
	public String getJob_title() {
		return job_title;
	}

	/**
	 * @param job_title the job_title to set
	 */
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	/**
	 * @return the job_type
	 */
	public String getJob_type() {
		return job_type;
	}

	/**
	 * @param job_type the job_type to set
	 */
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	/**
	 * @return the exp_req
	 */
	public String getExp_req() {
		return exp_req;
	}

	/**
	 * @param exp_req the exp_req to set
	 */
	public void setExp_req(String exp_req) {
		this.exp_req = exp_req;
	}

	/**
	 * @return the sal_max
	 */
	public String getSal_max() {
		return sal_max;
	}

	/**
	 * @param sal_max the sal_max to set
	 */
	public void setSal_max(String sal_max) {
		this.sal_max = sal_max;
	}

	/**
	 * @return the sal_min
	 */
	public String getSal_min() {
		return sal_min;
	}

	/**
	 * @param sal_min the sal_min to set
	 */
	public void setSal_min(String sal_min) {
		this.sal_min = sal_min;
	}

	/**
	 * @return the listoflocationId
	 */
	public  List<String>  getListoflocationId() {
		return listoflocationId;
	}

	/**
	 * @param listoflocationId the listoflocationId to set
	 */
	public void setListoflocationId(List<String>  listoflocationId) {
		this.listoflocationId = listoflocationId;
	}

	/**
	 * @return the listofjobskillsId
	 */
	public List<String>  getListofjobskillsId() {
		return listofjobskillsId;
	}

	/**
	 * @param listofjobskillsId the listofjobskillsId to set
	 */
	public void setListofjobskillsId(List<String> listofjobskillsId) {
		this.listofjobskillsId = listofjobskillsId;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
}
