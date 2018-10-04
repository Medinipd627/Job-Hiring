/**
 * 
 */
package com.bridgelabz.eureka.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created By:Medini P.D 
 * Date:- 03/10/2018 
 * Purpose:LocationId pojo
 */

@Document(collection = "location")
public class LocationId {

	@Id
	@ApiModelProperty(hidden=true)
	private String jobLocId;

	private String locationName;

	private String lastUpdatedTime;

	/**
	 * @return the jobLocId
	 */
	public String getJobLocId() {
		return jobLocId;
	}

	/**
	 * @param jobLocId
	 *            the jobLocId to set
	 */
	public void setJobLocId(String jobLocId) {
		this.jobLocId = jobLocId;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName
	 *            the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * @return the lastUpdatedTime
	 */
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	/**
	 * @param lastUpdatedTime
	 *            the lastUpdatedTime to set
	 */
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
}
