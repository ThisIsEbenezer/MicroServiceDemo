package com.htc.clinicmanagement.presistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.clinicmanagement.model.Clinic;

@RepositoryRestResource(collectionResourceRel="clinic",path="clinic")
public interface ClinicServiceRepository extends PagingAndSortingRepository<Clinic,Long> {

	List<Clinic> findByClinicId(@Param("appoitmentId") Long appoitmentId);
	
//	List<Clinic> findByDoctorId(@Param("doctorId") Long doctorId);
//	
//	List<Clinic> findByDate(@Param("doctorId") Long doctorId);
//	
	
	
	
	
}
