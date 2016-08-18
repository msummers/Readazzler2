package com.mikeco.readazzler.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.mikeco.readazzler.models.User;
import com.mikeco.readazzler.repositories.UserRepository;

@Component
public class StartupEventListener {
	private static final Logger LOG = LoggerFactory.getLogger(StartupEventListener.class);

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		LOG.info("Increment counter");
		User.loadOpml();
	}
}
