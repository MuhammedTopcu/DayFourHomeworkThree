package Entities;

import Abstract.Entity;

public class GamerCustomer implements Entity {
	private int id;
	private String nationalityId;
	private String firsName;
	private String lastName;
	private String birthDay;
	
	public GamerCustomer() {
		
	}

	public GamerCustomer(int id, String nationalityId, String firsName, String lastName, String birthDay) {
		this.id = id;
		this.nationalityId = nationalityId;
		this.firsName = firsName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
}
