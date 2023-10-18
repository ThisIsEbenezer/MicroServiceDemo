package com.htc.clinicaggregate.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.clinicaggregate.model.Patient;

@FeignClient("appointment-doctor-service")
@Component
public interface DoctorServiceCaller {
	
	@GetMapping("/doctor/search/findByDoctorId")
	CollectionModel<Patient> findByDoctorId(@RequestParam("doctorId") Long doctorId);


}
