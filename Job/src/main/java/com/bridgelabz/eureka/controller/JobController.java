/**
 * 
 */
package com.bridgelabz.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.eureka.model.Job;
import com.bridgelabz.eureka.model.JobSkills;
import com.bridgelabz.eureka.model.LocationId;
import com.bridgelabz.eureka.service.JobService;
import com.bridgelabz.eureka.util.jobExceptionHandler;

/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:Controller class for the job hiring 
 */

@RestController
@RequestMapping(value = "/jobtable")
public class JobController {
	
	@Autowired
	JobService jobservice;
	
	@RequestMapping(value="/jobDetails", method=RequestMethod.POST)
	private ResponseEntity jobdetails(@RequestBody Job job)
	{
		jobservice.jobdetails(job);
		return new ResponseEntity("JOB Details saved properly", HttpStatus.OK);
	}
	
	@RequestMapping(value="/createSkills", method=RequestMethod.POST)
	private ResponseEntity createJobskills(@RequestBody JobSkills jobskills,@RequestParam("jobPostid") String jobPostid) throws jobExceptionHandler
	{
		jobservice.createJobskills(jobskills, jobPostid);
		return new ResponseEntity("Job Skills Details saved properly", HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/createLocation", method=RequestMethod.POST)
	private ResponseEntity createLocation(@RequestBody LocationId locationid,@RequestParam("jobPostid") String jobPostid) throws jobExceptionHandler
	{
		jobservice.createLocation(locationid, jobPostid);
		return new ResponseEntity("Job Skills Details saved properly", HttpStatus.CREATED);
	}
	
	
	
	
	@RequestMapping(value="/addskills", method=RequestMethod.POST)
	private ResponseEntity addJobSkills(@RequestParam("jobskillId") String jobskillId,@RequestParam("jobPostid") String jobPostid) throws jobExceptionHandler
	{
		jobservice.addJobSkills(jobskillId, jobPostid);
		return new ResponseEntity("Job Skills added properly", HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/addlocation", method=RequestMethod.POST)
	private ResponseEntity addJobLocation(@RequestParam("jobLocId")String jobLocId,@RequestParam("jobPostid")String jobPostid) throws jobExceptionHandler
	{
		jobservice.addJobLocation(jobLocId, jobPostid);
		return new ResponseEntity("Job Location added properly", HttpStatus.CREATED);
	}

}
