package com.sanika.entity;

import java.util.Objects;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="employees")
public class Employee {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message="Name should not blank")
	private String name;
	
	@Email(message="Invalid email")
	private String email;
	
	@NotBlank(message="Department is required")
	private String department;
	
	@Positive
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, @NotBlank(message = "Name should not blank") String name,
			@Email(message = "Invalid email") String email,
			@NotBlank(message = "Department is required") String department, @Positive double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, email, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + ", salary="
				+ salary + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
