package com.numeriquepro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.numeriquepro"})
public class NumeriqueproConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("WEB-INF/");// ou se trouve nos page web
		vr.setSuffix(".jsp"); // extension des fichier c'est ici qu'il faut agir quand on change de template de vue
		return vr;
		
	}

}
