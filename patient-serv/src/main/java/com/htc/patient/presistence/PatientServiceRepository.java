package com.htc.patient.presistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.patient.model.Patient;

import feign.Param;

@RepositoryRestResource(collectionResourceRel="patient",path="patient")
public interface PatientServiceRepository extends PagingAndSortingRepository<Patient,Long> {

	List<Patient> findByPatientId(@Param("patientId") Long patientId);
}
