/**
 * 
 */
package com.bridgelabz.eureka.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bridgelabz.eureka.model.Job;

import com.bridgelabz.eureka.model.JobSkills;
import com.bridgelabz.eureka.model.LocationId;

import com.bridgelabz.eureka.repository.JobRepository;
import com.bridgelabz.eureka.repository.JobSkillsRepository;
import com.bridgelabz.eureka.repository.LocationRepository;
import com.bridgelabz.eureka.util.jobExceptionHandler;



/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:
 */
@Service
public class JobServiceImpl<jobSkillRepository, locationRepository> implements JobService {

	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	JobSkillsRepository jobSkillRepository;
	
	@Autowired
	LocationRepository locationRepository;
	
	
	public void jobdetails(Job job) {
	{
		//Optional<Job> job1=jobRepository.findById(job.getJobPostId());
		job.setLastUpdatedDate(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		job.setJob_title(job.getJob_title());
		job.setJob_role(job.getJob_role());
		job.setExp_req(job.getExp_req());
		job.setListofjobskillsId(job.getListofjobskillsId());
		job.setListoflocationId(job.getListoflocationId());
		job.setSal_max(job.getSal_max());
		job.setSal_min(job.getSal_min());
		jobRepository.save(job);
		System.out.println("saving to the database");
	}
	}
	
	public void createJobskills(JobSkills jobskills, String jobPostid) throws jobExceptionHandler {
		if (jobskills.getJobskillName() == null)
			throw new jobExceptionHandler("jobskills can't be created without name");
		try {
			jobskills.setJobskillId(jobskills.getJobskillId());
			jobskills.setJobskillName(jobskills.getJobskillName());
			jobskills.setLastUpdatedTime(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));

		jobSkillRepository.save(jobskills);
		} catch (DataIntegrityViolationException | ConstraintViolationException e) {
			throw new jobExceptionHandler("skills cannot be created due to database error, please try again later");
		}
	}
	
	public void createLocation(LocationId locationid, String jobPostid) throws jobExceptionHandler {
		if (locationid.getLocationName() == null)
			throw new jobExceptionHandler("joblocation fields can't be created without name");
		try {
			locationid.setLocationName(locationid.getLocationName());
			locationid.setJobLocId(locationid.getJobLocId());
			locationid.setLastUpdatedTime(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		locationRepository.save(locationid);
		} catch (DataIntegrityViolationException | ConstraintViolationException e) {
			throw new jobExceptionHandler("job location cannot be created due to database error, please try again later");
		}
	}
	
	public void addJobSkills(String jobskillId, String jobPostid) throws jobExceptionHandler {
	JobSkills skills = new JobSkills();
Optional<Job> job = jobRepository.findById(jobPostid);
if (job.get().getJobPostId()== null) {
	List<String> newskillList = new ArrayList<>();
	job.get().setListofjobskillsId(newskillList);
}
Iterable<JobSkills> list = jobSkillRepository.findAll();
for (JobSkills l : list) {

	if (l.getJobskillId().equals(jobskillId)){
		Optional<Job> optionalnote = jobRepository.findById(jobPostid);
		if (!optionalnote.isPresent()) {
			throw new jobExceptionHandler("jobId not found");
		}
		skills.setJobskillId(optionalnote.get().getJobPostId());
		skills.setJobskillId(skills.getJobskillId());
		job.get().getListofjobskillsId().add(jobskillId);
		jobRepository.save(job.get());
	System.out.println("job skills id adding properly");
	}
}
}

	public void addJobLocation(String jobLocId, String jobPostid)throws jobExceptionHandler{
		LocationId location = new LocationId();
		Optional<Job> job = jobRepository.findById(jobPostid);
		if (job.get().getJobPostId()== null) {
			List<String> newskillList = new ArrayList<>();
			job.get().setListofjobskillsId(newskillList);
		}
		Iterable<LocationId> list = locationRepository.findAll();
		for (LocationId l : list) {

			if (l.getJobLocId().equals(jobLocId)){
				Optional<Job> optionalnote = jobRepository.findById(jobPostid);
				if (!optionalnote.isPresent()) {
					throw new jobExceptionHandler("jobId not found");
				}
				location.setJobLocId(optionalnote.get().getJobPostId());
				location.setJobLocId(location.getJobLocId());
				job.get().getListoflocationId().add(jobLocId);
				jobRepository.save(job.get());
			System.out.println("job location id  adding properly");
			}
		}
	}
}
