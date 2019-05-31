package com.example.gcpdemo1.bo;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonInterface extends DatastoreRepository<Person, Long>  {

	
}
 
