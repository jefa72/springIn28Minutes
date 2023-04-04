package com.jesoftware.routesselector.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("WalkingRouterStrategy")
public class WalkingRouterStrategy implements Router {
	
	public String getRoute() {
		return "walking route";
	}

}
