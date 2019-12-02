package com.ustglobal.retailermanagementsystemspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class ORMCConfig {
	@Bean
	public LocalEntityManagerFactoryBean  getBean() {
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("retail-unit");
		return bean;
	}
}
