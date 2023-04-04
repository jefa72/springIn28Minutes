package com.jesoftware.routesselector;

import com.jesoftware.routesselector.services.AirplaneRouteService;
import com.jesoftware.routesselector.services.CarRouteService;
import com.jesoftware.routesselector.services.WalkingRouteService;
import com.jesoftware.routesselector.models.Router;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/jesoftware/routesselector")
public class RoutesSelectorApplication {

	public static void main(String[] args) {

		try (var context =
					 new AnnotationConfigApplicationContext(RoutesSelectorApplication.class)) {
			if ("walking".equals(args[0])) {
				System.out.println(context.getBean(WalkingRouteService.class).getRouter().getRoute());
			} else if ("car".equals(args[0])) {
				System.out.println(context.getBean(CarRouteService.class).getRouter().getRoute());
			} else if ("airplane".equals(args[0])) {
				System.out.println(context.getBean(AirplaneRouteService.class).getRouter().getRoute());
			}
		}
		
	}

}
