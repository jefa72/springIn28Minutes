package com.jesoftware.routesselector.services;

import com.jesoftware.routesselector.models.Router;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WalkingRouteService {
	
	private Router router;
	
	public WalkingRouteService(@Qualifier("WalkingRouterStrategy") Router router) {
		this.router = router;
	}

	public Router getRouter() {
		return this.router;
	}


}
