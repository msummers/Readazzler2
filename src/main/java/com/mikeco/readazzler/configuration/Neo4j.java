package com.mikeco.readazzler.configuration;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.kernel.GraphDatabaseAPI;
import org.neo4j.ogm.drivers.embedded.driver.EmbeddedDriver;
import org.neo4j.ogm.service.Components;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.server.WrappingNeoServerBootstrapper;
import org.neo4j.server.configuration.Configurator;
import org.neo4j.server.configuration.ServerConfigurator;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SuppressWarnings("deprecation")
@Configuration
@EnableNeo4jRepositories(basePackages = "com.mikeco.readazzler")
@EnableTransactionManagement
public class Neo4j extends Neo4jConfiguration {

	@Bean
	// @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Session getSession() throws Exception {
		return super.getSession();
	}

	@Bean
	public org.neo4j.ogm.config.Configuration getConfiguration() {
		org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
		config.driverConfiguration()
			.setDriverClassName("org.neo4j.ogm.drivers.embedded.driver.EmbeddedDriver")
			.setURI("file:///var/tmp/graph.db");
		return config;
	}

	@Bean
	public SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new SessionFactory(getConfiguration(), "com.mikeco.readazzler");
		return sessionFactory;
	}

	@SuppressWarnings("deprecation")
	public void neo4jBrowser() {
		EmbeddedDriver embeddedDriver = (EmbeddedDriver) Components.driver();
		GraphDatabaseService gdb = embeddedDriver.getGraphDatabaseService();
		try {
			WrappingNeoServerBootstrapper neoServerBootstrapper;
			GraphDatabaseAPI api = (GraphDatabaseAPI) gdb;

			ServerConfigurator config = new ServerConfigurator(api);
			config.configuration()
				.addProperty(Configurator.WEBSERVER_ADDRESS_PROPERTY_KEY, "127.0.0.1");
			config.configuration()
				.addProperty(Configurator.WEBSERVER_PORT_PROPERTY_KEY, "8686");

			neoServerBootstrapper = new WrappingNeoServerBootstrapper(api, config);
			neoServerBootstrapper.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
