/**
 * 
 */
package com.bridgelabz.eureka.service;

import java.util.List;

import com.bridgelabz.eureka.model.Job;
import com.bridgelabz.eureka.model.JobSkills;
import com.bridgelabz.eureka.model.LocationId;
import com.bridgelabz.eureka.util.jobExceptionHandler;

/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:Job Service interface for job hiring
 */
public interface JobService {

	public void jobdetails(Job job) ;
	
	

	/**
	 * @param jobskills
	 * @param jobPostid
	 * @throws jobExceptionHandler 
	 */
	public void createJobskills(JobSkills jobskills, String jobPostid) throws jobExceptionHandler;

	/**
	 * @param locationid
	 * @param jobPostid
	 * @throws jobExceptionHandler 
	 */
	public void createLocation(LocationId locationid, String jobPostid) throws jobExceptionHandler;


	/**
	 * @param skillsId
	 * @param jobPostid
	 * @throws jobExceptionHandler 
	 */
	public void addJobSkills(String skillsId, String jobPostid) throws jobExceptionHandler;
	
	public void addJobLocation(String jobLocId, String jobPostid) throws jobExceptionHandler;


}
