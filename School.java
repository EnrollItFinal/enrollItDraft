package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "ADMIN_SCHOOL")
public class School {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String schoolId;
	@OneToOne
	Address address;
	@OneToOne
	Facilities facilities;
	@Column
	String status;
	public School(String schoolId, Address address, Facilities facilities, String status) {
	      super( );
	      this.schoolId = schoolId;
	      this.address = address;
	      this.facilities = facilities;
	      this.status = status;
	   }

	   public School( ) {
	      super();
	   }
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Facilities getFacilities() {
		return facilities;
	}
	public void setFacilities(Facilities facilities) {
		this.facilities = facilities;
	}
}
