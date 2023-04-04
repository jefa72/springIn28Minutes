package com.jesoftware.routesselector.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CarRouterStrategy")
public class CarRouterStrategy implements Router {

	public String getRoute() {
		return "car route";
	}

}
