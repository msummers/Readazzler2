package com.mikeco.readazzler.configuration;

import org.neo4j.graphdb.GraphDatabaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.mikeco.readazzler.services.OpmlImport;

@Component
public class StartupEventListener {
	private static final Logger log = LoggerFactory.getLogger(StartupEventListener.class);
	@Autowired
	private ApplicationContext appContext;
	@Autowired
	OpmlImport opmlImport;
	@Autowired 
	Neo4j neo4j;
//	@Autowired
//	GraphDatabaseService db;

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		log.info("Increment counter");
		opmlImport.fromFileName("jim.opml");
		//neo4j.neo4jBrowser(db);
		for(String name : appContext.getBeanDefinitionNames()){
			if(name.toLowerCase().contains("neo"))
			log.debug("Bean: " + name);
		}
	}
}