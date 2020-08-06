package com.assimilate.vespa.model;

public class Vespa {
	private String name;
	@Override
	public String toString() {
		return "Vespa [name=" + name + ", mobile=" + mobile + ", email=" + email + ", city=" + city + "]";
	}
	public Vespa() {}
	public Vespa(String name, String mobile, String email, String city) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String mobile;
	private String email;
	private String city;

}
