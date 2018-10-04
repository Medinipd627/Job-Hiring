/**
 * 
 */
package com.bridgelabz.eureka.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.eureka.model.LocationId;

/**
 * Created By:Medini P.D
 * Date:- 03/10/2018
 * Purpose:Location Repository for job hiring
 */
public interface LocationRepository extends MongoRepository<LocationId, String> {

	/**
	 * @param jobLocId
	 * @return
	 */
//LocationId findBy jobLocId(String jobLocId);

}
