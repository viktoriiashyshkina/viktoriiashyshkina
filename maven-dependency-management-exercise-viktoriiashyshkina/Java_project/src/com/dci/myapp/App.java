package com.dci.myapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.io.StringWriter;



public class App{

	public static void main(String[] args) throws IOException{
		System.out.println("Java project using Maven as a build tool");
		
		useJacksonLibrary();
	}
	
	private static void useJacksonLibrary() throws IOException{
				
				//create ObjectMapper instance - a class from jackson databind
				ObjectMapper objectMapper = new ObjectMapper();
				
				//convert Object to json string
				Employee emp1 = Employee.createEmployee();
				//configure Object mapper for pretty print
				objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
				
				//writing to console, can write to any output stream such as file
				StringWriter stringEmp = new StringWriter();
				objectMapper.writeValue(stringEmp, emp1);
				System.out.println("Employee JSON is\n"+stringEmp);
	}
	
	
}