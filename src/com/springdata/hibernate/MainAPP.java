package com.springdata.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainAPP {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/employee?useSSL=false";
	String username="root";
	String password="#fadyfady10#";
	
    try {
    	Connection connection = DriverManager.getConnection(url, username, password);
    	System.out.println("Connected to database");
    	System.out.println(connection);
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	
}
}
