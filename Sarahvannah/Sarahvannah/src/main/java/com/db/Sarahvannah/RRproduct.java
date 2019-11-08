package com.db.Sarahvannah;




import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RRproduct extends CrudRepository<product, Integer>{
	
}