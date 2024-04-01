package com.app.ptkp.system.conf;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {
				"com.app.ptkp.system.controller.model",
				"com.app.ptkp.system.controller.interview.model",
				"com.app.ptkp.system.controller.interviewsm.model"
				})
@EnableJpaRepositories(
		repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class,
		basePackages = {
				"com.app.ptkp.system.controller.repo",
				"com.app.ptkp.system.controller.interview.repo",
				"com.app.ptkp.system.controller.interviewsm.repo"
				}) 
@EnableTransactionManagement
public class JpaConfig {
}