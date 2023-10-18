package com.htc.clinicaggregate.caller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.clinicaggregate.model.Clinic;


@FeignClient("appointment-clinic-service")
public interface ClinicServiceCaller {

	@GetMapping("/api/clinic/{id}")
	Clinic findByClinicId(@PathVariable Long appoitmentId);
	
	
	
	
	
}
