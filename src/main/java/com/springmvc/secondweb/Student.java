package com.springmvc.secondweb;

import com.springmvc.secondweb.validation.StudentId;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.lang.annotation.Native;
import java.util.LinkedHashMap;

@Getter @Setter
public class Student {

	@NotNull(message = "required")
	@Size(min=1, message = "required")
	private String firstName;
	@NotNull(message = "required")
	@Size(min=2, message = "required")
	private String lastName;

	@NotNull(message = "required")
	private String gender;

	@NotNull(message = "required")
	@Min(value = 16, message = "Age should be greater than 15")
	@Max(value = 30, message = "Age should be less than or equal to 30")
	private Integer age;

	@Pattern(regexp = "^[a-zA-Z]+[a-zA-Z0-9.]*@[a-zA-Z.]+$", message = "Invalid Email")
	private String email;

	@StudentId(value = "ZEM", message = "must start with ZEM")
	private String studentId;

	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	public Student() {

		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("NZ", "NewZealand");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("AU", "Australia");
		countryOptions.put("US", "United States of America");		

	}

	/*public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}*/
			
}
