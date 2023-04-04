package com.jesoftware.routesselector.services;

import com.jesoftware.routesselector.models.Router;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AirplaneRouteService {

	private Router router;

	public AirplaneRouteService(@Qualifier("AirplaneRouterStrategy") Router router) {
		this.router = router;
	}

	public Router getRouter() {
		return this.router;
	}


}
