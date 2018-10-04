/**
 * 
 */
package com.bridgelabz.eureka.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.eureka.model.Job;
import com.bridgelabz.eureka.model.JobSkills;

/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:Job Repository for job hiring
 */
@Repository
public interface JobRepository extends MongoRepository<Job, String>{

	/**
	 * @param jobskills
	 * @return
	 */
	Job findByJobPostId(String jobskills);

	/**
	 * @param job1
	 */
	void save(Optional<Job> job1);

	/**
	 * @param jobskillId
	 */
	void save(String jobskillId);

	/**
	 * @param listofjobskillsId
	 */
	static void save(List<JobSkills> listofjobskillsId) {
		// TODO Auto-generated method stub
		
	}

}
