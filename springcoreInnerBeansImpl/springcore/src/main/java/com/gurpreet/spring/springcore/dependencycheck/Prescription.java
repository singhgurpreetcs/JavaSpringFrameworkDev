package com.gurpreet.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	private int id;
	private String name;

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", name=" + name + ", medicines=" + medicines + "]";
	}

	private List<String> medicines;

	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
}
