package com.htc.clinic.presistence;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.clinic.modal.Clinic;



@RepositoryRestResource(collectionResourceRel="clinic",path="clinic")
public interface ClinicServiceRepository {
	
	List<Clinic> findByClinicId(@Param("appoitmentId") Long appoitmentId);

}
