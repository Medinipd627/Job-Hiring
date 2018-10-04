/**
 * 
 */
package com.bridgelabz.eureka.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.eureka.model.JobSkills;

/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:JobSkillsRepository for job hiring
 */
public interface JobSkillsRepository extends MongoRepository<JobSkills, String> {

	/**
	 * @param jobskillId
	 * @return
	 */
	JobSkills findByjobskillId(String jobskillId);

}
