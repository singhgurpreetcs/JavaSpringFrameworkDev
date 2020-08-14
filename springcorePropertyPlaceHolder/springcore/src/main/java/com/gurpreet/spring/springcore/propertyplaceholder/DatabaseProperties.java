package com.gurpreet.spring.springcore.propertyplaceholder;

public class DatabaseProperties {
	private String dbServer;

	DatabaseProperties(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "DatabaseProperties [dbServer=" + dbServer + "]";
	}
}
