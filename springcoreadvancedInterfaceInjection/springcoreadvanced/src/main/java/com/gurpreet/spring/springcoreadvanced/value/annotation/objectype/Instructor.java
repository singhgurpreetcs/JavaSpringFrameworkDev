package com.gurpreet.spring.springcoreadvanced.value.annotation.objectype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Instructor {

	// @Value("#{66+44}")
	//@Value("#{T(java.lang.Math).abs(-99)}")
	@Value("#{new Integer(88)}")
	private int id;

	//@Value("Gurpreet Singh")
	//@Value("#{'Gurpreet Singh'}")
	@Value("#{new java.lang.String('Gurpreet Singh')}")
	private String name;
	
	@Value("#{2+4>8?false:true}")
	private boolean active;

	@Value("#{progLanguageId}")
	private List<String> progLanguages;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", progLanguages=" + progLanguages
				+ ", profile=" + profile + "]";
	}
}
