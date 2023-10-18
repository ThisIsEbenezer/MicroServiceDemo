package com.htc.clinicaggregate.service;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htc.clinicaggregate.model.ClinicAggregate;


@RequestMapping("/default")
public interface ClinicAggService {
	
	@GetMapping(value="/clinic-agg/{id}",produces="application/json")
	ClinicAggregate getClinic(@PathVariable Long id);
	
	@GetMapping(value="/findByClinicId/{id}",produces="application/json")
	List<ClinicAggregate> findByClinicId(@PathVariable Long appoitmentId);
	
	@GetMapping(value="/findByDoctorId/{id}",produces="application/json")
	List<ClinicAggregate> findByDoctorId(@PathVariable Long doctorId);
	
	@GetMapping(value="/findByDate/{id}",produces="application/json")
	List<ClinicAggregate> findByDate(@PathVariable Long doctorId);

}
