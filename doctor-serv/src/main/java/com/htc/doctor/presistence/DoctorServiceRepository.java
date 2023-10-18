package com.htc.doctor.presistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.doctor.model.Doctor;


import feign.Param;


@RepositoryRestResource(collectionResourceRel="doctor",path="doctor")
public interface DoctorServiceRepository extends PagingAndSortingRepository<Doctor,Long> {
	
	List<Doctor> findByDoctorId(@Param("doctorId") Long doctorId);
}
