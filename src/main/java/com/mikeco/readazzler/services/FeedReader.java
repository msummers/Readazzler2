package com.mikeco.readazzler.services;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.mikeco.readazzler.models.Feed;
import com.mikeco.readazzler.repositories.FeedRepository;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

@Service
public class FeedReader {
	Logger log = LoggerFactory.getLogger(FeedReader.class);
	@Autowired
	FeedRepository feedRepo;

	// Every 10 minutes
	@Scheduled(fixedDelay = 1000 * 60 * 10)
	public void readFeeds() {
		log.info("readFeeds: enter");

		for (Feed feed : feedRepo.findAll()) {
			log.debug(String.format("readFeeds: %s ", feed.getRssUrl()));
			try {
				URL feedUrl = new URL(feed.getRssUrl());

				SyndFeedInput input = new SyndFeedInput();
				SyndFeed syndFeed = input.build(new XmlReader(feedUrl));
				for(SyndEntry syndEntry : syndFeed.getEntries()){
					//log.debug("readFeeds: " + syndFeed);
				}
			} catch (Exception e) {
				log.error("Most likely this blog is gone");
				log.error(e.getMessage());
			}
		}
	}
}