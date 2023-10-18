package com.htc.clinic.modal;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clinicc")
public class Clinic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appoitmentId;
	
	@Column
	private Long patientId;
		
	@Column
	private Long doctorId;

	@Column
	private LocalDateTime datetime;

	public Clinic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clinic(Long appoitmentId, Long patientId, Long doctorId, LocalDateTime datetime) {
		super();
		this.appoitmentId = appoitmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.datetime = datetime;
	}

	public Long getAppoitmentId() {
		return appoitmentId;
	}

	public void setAppoitmentId(Long appoitmentId) {
		this.appoitmentId = appoitmentId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appoitmentId == null) ? 0 : appoitmentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clinic other = (Clinic) obj;
		if (appoitmentId == null) {
			if (other.appoitmentId != null)
				return false;
		} else if (!appoitmentId.equals(other.appoitmentId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clinic [appoitmentId=" + appoitmentId + ", patientId=" + patientId + ", doctorId=" + doctorId
				+ ", datetime=" + datetime + "]";
	}
	
	
	

}
