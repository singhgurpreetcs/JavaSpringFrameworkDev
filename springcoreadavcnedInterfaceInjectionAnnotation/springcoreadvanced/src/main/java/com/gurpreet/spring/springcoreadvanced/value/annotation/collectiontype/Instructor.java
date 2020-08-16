package com.gurpreet.spring.springcoreadvanced.value.annotation.collectiontype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Instructor {

	@Value("10")
	private int id;
	@Value("Gurpreet Singh")
	private String name;

	@Value("#{progLanguageId}")
	private List<String> progLanguages;

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
		return "Instructor [id=" + id + ", name=" + name + ", progLanguages=" + progLanguages + "]";
	}
}
