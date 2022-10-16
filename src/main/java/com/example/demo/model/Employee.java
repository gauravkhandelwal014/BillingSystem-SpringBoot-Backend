package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "gst_no")
	private Double gstNo;
	
	@Column(name = "pan_no")
	private String panNo;
	
	@Column(name = "code")
	private Double code;
	
	@Column(name = "pin_code")
	private Double pinCode;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "mobile_no")
	private Double mobileNo;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "cpd_name")
	private String cpdName;
	
	@Column(name = "cpd_mobileNo")
	private Double cpdMobileNo;
	
	@Column(name = "cpd_email")
	private String cpdEmail;
	
	@Column(name = "department")
	private String cpdDepartment;
	
	@Column(name = "designation")
	private String cpdDesignation;

	public Employee(){
		
	}
	
	

	public Employee(String name, String emailId, String address, Double gstNo, String panNo, Double code,
			Double pinCode, String country, String state, String city, Double mobileNo, String latitude,
			String longitude, String currency, String cpdName, Double cpdMobileNo, String cpdEmail,
			String cpdDepartment, String cpdDesignation) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.address = address;
		this.gstNo = gstNo;
		this.panNo = panNo;
		this.code = code;
		this.pinCode = pinCode;
		this.country = country;
		this.state = state;
		this.city = city;
		this.mobileNo = mobileNo;
		this.latitude = latitude;
		this.longitude = longitude;
		this.currency = currency;
		this.cpdName = cpdName;
		this.cpdMobileNo = cpdMobileNo;
		this.cpdEmail = cpdEmail;
		this.cpdDepartment = cpdDepartment;
		this.cpdDesignation = cpdDesignation;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getGstNo() {
		return gstNo;
	}

	public void setGstNo(Double gstNo) {
		this.gstNo = gstNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Double getCode() {
		return code;
	}

	public void setCode(Double code) {
		this.code = code;
	}

	public Double getPinCode() {
		return pinCode;
	}

	public void setPinCode(Double pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Double mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCpdName() {
		return cpdName;
	}

	public void setCpdName(String cpdName) {
		this.cpdName = cpdName;
	}

	public Double getCpdMobileNo() {
		return cpdMobileNo;
	}

	public void setCpdMobileNo(Double cpdMobileNo) {
		this.cpdMobileNo = cpdMobileNo;
	}

	public String getCpdEmail() {
		return cpdEmail;
	}

	public void setCpdEmail(String cpdEmail) {
		this.cpdEmail = cpdEmail;
	}

	public String getCpdDepartment() {
		return cpdDepartment;
	}

	public void setCpdDepartment(String cpdDepartment) {
		this.cpdDepartment = cpdDepartment;
	}

	public String getCpdDesignation() {
		return cpdDesignation;
	}

	public void setCpdDesignation(String cpdDesignation) {
		this.cpdDesignation = cpdDesignation;
	}

	
	
			
	

	
	
}