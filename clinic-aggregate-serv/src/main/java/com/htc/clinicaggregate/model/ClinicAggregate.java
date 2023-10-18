package com.htc.clinicaggregate.model;

import java.time.LocalDateTime;
import java.util.List;

public class ClinicAggregate {
	
	private Long appoitmentId;
	
	private LocalDateTime datetime;
	
	private List<Doctor> doctor;
	private List<Patient> patient;
	
	
	public ClinicAggregate() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ClinicAggregate(Long appoitmentId, LocalDateTime datetime, List<Doctor> doctor, List<Patient> patient) {
		super();
		this.appoitmentId = appoitmentId;
		this.datetime = datetime;
		this.doctor = doctor;
		this.patient = patient;
	}


	public Long getAppoitmentId() {
		return appoitmentId;
	}


	public void setAppoitmentId(Long appoitmentId) {
		this.appoitmentId = appoitmentId;
	}


	public LocalDateTime getDatetime() {
		return datetime;
	}


	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}


	public List<Doctor> getDoctor() {
		return doctor;
	}


	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}


	public List<Patient> getPatient() {
		return patient;
	}


	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}


	@Override
	public String toString() {
		return "ClinicAggregate [appoitmentId=" + appoitmentId + ", datetime=" + datetime + ", doctor=" + doctor
				+ ", patient=" + patient + "]";
	}
	
	

}
