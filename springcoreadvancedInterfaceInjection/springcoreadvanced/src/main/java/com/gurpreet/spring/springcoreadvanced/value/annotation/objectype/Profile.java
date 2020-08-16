package com.gurpreet.spring.springcoreadvanced.value.annotation.objectype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("Software Developer Senior")
	private String title;
	@Value("TSYS")
	private String company;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

}
