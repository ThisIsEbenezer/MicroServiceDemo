package com.htc.clinicaggregate.model;



public class Doctor {
	
	
	private Long doctorId;
	
	
	private String doctorName;
	

	private String doctorDetails;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Long doctorId, String doctorName, String doctorDetails) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorDetails = doctorDetails;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorDetails() {
		return doctorDetails;
	}

	public void setDoctorDetails(String doctorDetails) {
		this.doctorDetails = doctorDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doctorId == null) ? 0 : doctorId.hashCode());
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
		Doctor other = (Doctor) obj;
		if (doctorId == null) {
			if (other.doctorId != null)
				return false;
		} else if (!doctorId.equals(other.doctorId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorDetails=" + doctorDetails + "]";
	}
	
	
	
	

}
