package com.htc.clinicaggregate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.htc.clinicaggregate.caller.ClinicServiceCaller;
import com.htc.clinicaggregate.caller.DoctorServiceCaller;
import com.htc.clinicaggregate.caller.PatientServiceCaller;
import com.htc.clinicaggregate.model.Clinic;
import com.htc.clinicaggregate.model.ClinicAggregate;
import com.htc.clinicaggregate.model.Doctor;
import com.htc.clinicaggregate.model.Patient;

@RestController
public class ClinicAggServiceInegration implements ClinicAggService {
	
	@Autowired
	private PatientServiceCaller psc;
	
	@Autowired
	private DoctorServiceCaller dsc;
	
	@Autowired
	private ClinicServiceCaller csc;

	@Override
	public ClinicAggregate getClinic(Long id) {
		// TODO Auto-generated method stub
	ClinicAggregate ca = new ClinicAggregate();
		
	Clinic c = new Clinic();
	c = csc.findByClinicId(id);
	ca.setAppoitmentId(c.getAppoitmentId());
	ca.setDatetime(c.getDatetime());
	
	List<Patient> p = new ArrayList<>();
	p.addAll(psc.findByPatientId(id).getContent());
	ca.setPatient(p);
	
	List<Doctor> d = new ArrayList<>();
	p.addAll(dsc.findByDoctorId(id).getContent());
	ca.setDoctor(d);
	
	return ca;
	
	}

	@Override
	public List<ClinicAggregate> findByClinicId(Long appoitmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClinicAggregate> findByDoctorId(Long doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClinicAggregate> findByDate(Long doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<ClinicAggregate> findByClinicId(Long appoitmentId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<ClinicAggregate> findByDoctorId(Long doctorId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<ClinicAggregate> findByDate(Long doctorId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
