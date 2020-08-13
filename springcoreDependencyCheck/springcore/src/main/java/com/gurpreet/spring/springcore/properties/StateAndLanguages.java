package com.gurpreet.spring.springcore.properties;

import java.util.Properties;

public class StateAndLanguages {
	private Properties stateAndLangs;

	public Properties getStateAndLangs() {
		return stateAndLangs;
	}

	public void setStateAndLangs(Properties stateAndLangs) {
		this.stateAndLangs = stateAndLangs;
	}

	@Override
	public String toString() {
		return "StateAndLanguages [stateAndLangs=" + stateAndLangs + "]";
	}
}