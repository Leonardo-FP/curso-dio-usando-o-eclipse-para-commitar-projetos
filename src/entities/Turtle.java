package entities;

import java.util.Objects;

public class Turtle {
	private String name;
	private Integer age;
	private Double sizeInCentimeters;

	public Turtle(String name, Integer age, Double sizeInCentimeters) {
		this.name = name;
		this.age = age;
		this.sizeInCentimeters = sizeInCentimeters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSizeInCentimeters() {
		return sizeInCentimeters;
	}

	public void setSizeInCentimeters(Double sizeInCentimeters) {
		this.sizeInCentimeters = sizeInCentimeters;
	}

	@Override
	public String toString() {
		return "Name: " + name
				+"\nAge: " + age
				+"\nSize: " + sizeInCentimeters;
	}
	
	
	
	
}

