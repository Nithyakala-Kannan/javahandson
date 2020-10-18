package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.hcl")
public class EmpConfig {
	@Bean(name="employee")
	 public Employee getEmployee()
	 {
		 Employee employee=new Employee();
		 employee.setEmployeeName("Sathish" );
		 employee.setEmployeeMobileNumber("9566259957");
		 employee.setEmployeeEmail("me@gmail.com" );
		 employee.setEmployeeSalary(45000);
		 return employee;
	 }
	@Bean(name="address")
	public Address getAddress()
	{
		Address address=new Address();
		address.setLine1("2/115 Anna Nagar ");
		address.setLine2("Kaveripattinam");
		address.setCity("Krishnagiri ");
		address.setPincode("653218");
		return address;
	}

}
