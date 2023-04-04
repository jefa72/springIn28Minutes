package com.jesoftware.routesselector.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("AirplaneRouterStrategy")
public class AirplaneRouterStrategy implements Router {

	public String getRoute() {
		return "airplane route";
	}

}
