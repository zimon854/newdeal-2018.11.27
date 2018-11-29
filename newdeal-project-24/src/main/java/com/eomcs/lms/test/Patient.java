package com.eomcs.lms.test;

public class Patient {
	
	//필드
	private String name; //필드명 : name
	private int age; //필드명 : age
	private int weight; //필드명 : weight
	private int height; //필드명 : height
	
	//setter/getter = property 라고 통칭
	public String getName() { //프로퍼티명 : name
		return name;
	}
	public void setName(String name) { //프로퍼티명 : name
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
