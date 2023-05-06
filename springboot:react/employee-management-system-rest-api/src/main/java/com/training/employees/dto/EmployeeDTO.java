package com.training.employees.dto;

public class EmployeeDTO {

	private int id;
	private String username;
	private String password;
	private String name;
	private int age;
	private String experience;
	private double salary;
	private long phone;
	private String department;
	private boolean isActive;

	
//	public EmployeeDTO() {
//		super();
//	}
//	
//	public EmployeeDTO(String username, String password, String name, int age, String experience, double salary,
//			long phone, String department, boolean isActive) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.name = name;
//		this.age = age;
//		this.experience = experience;
//		this.salary = salary;
//		this.phone = phone;
//		this.department = department;
//		this.isActive = isActive;
//	}
	
	

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getExperience() {
		return experience;
	}

	public double getSalary() {
		return salary;
	}

	public long getPhone() {
		return phone;
	}

	public String getDepartment() {
		return department;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
