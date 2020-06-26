package com.madhu.github.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Document (collection = "Employee")
@ApiModel (description = "Details about the employee")
public class Employee {

	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	@ApiModelProperty(notes = "The unique id of the Employee")
	private long id;
	
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	@ApiModelProperty(notes = "The Employee's first name")
	private String firstName;
	@ApiModelProperty(notes = "The Employee's last name")
	private String lastName;
	
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	@ApiModelProperty(notes = "The Employee's email id")
	private String emailId;
	

	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
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
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	public int compareTo(Employee u) {
	    if (getFirstName() == null || u.getFirstName() == null) {
	      return 0;
	    }
	    return getFirstName().compareTo(u.getFirstName());
	 }

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + "]";
	}	
}