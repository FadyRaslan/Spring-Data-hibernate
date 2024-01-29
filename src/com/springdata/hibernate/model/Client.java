package com.springdata.hibernate.model;

public class Client {
	
private Long id;
private String fullName;
private int age;
private String adress;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}



}
