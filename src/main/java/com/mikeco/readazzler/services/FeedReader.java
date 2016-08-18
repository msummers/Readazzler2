package com.mikeco.readazzler.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.mikeco.readazzler.models.Feed;
import com.mikeco.readazzler.repositories.FeedRepository;

@Service
public class FeedReader {
	Logger log = LoggerFactory.getLogger(FeedReader.class);
	@Autowired
	FeedRepository feedRepo;

	// Every 10 minutes
	@Scheduled(fixedDelay = 1000 * 60 * 10)
	public void readFeeds() {
		log.info("readFeeds: enter");
		/*
		 *  org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'scopedTarget.getSession':
Scope 'session' is not active for the current thread; consider defining a scoped proxy for this bean if you intend to refer to it from a singleton;
nested exception is java.lang.IllegalStateException: No thread-bound request found: Are you referring to request attributes outside of an actual web request, or processing a request outside of the originally receiving thread? If you are actually operating within a web request and still receive this message, your code is probably running outside of DispatcherServlet/DispatcherPortlet: In this case, use RequestContextListener or RequestContextFilter to expose the current request.
		 */
		for(Feed feed : feedRepo.findAll()){
		// For each entry in the feed
		// Persist entry
		}
	}
}
