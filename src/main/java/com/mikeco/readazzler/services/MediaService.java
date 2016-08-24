package com.mikeco.readazzler.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikeco.readazzler.models.Media;
import com.mikeco.readazzler.repositories.MediaRepository;
import com.rometools.rome.feed.synd.SyndContent;

@Service
public class MediaService {
	@Autowired
	MediaRepository mediaRepo;
	Logger log = LoggerFactory.getLogger(MediaService.class);
	
	// <description>
	// <img src="http://66.media.tumblr.com/e696291bd37abe4161c5e67a0a07d02c/tumblr_ocbpciDt6E1u53c30o1_500.jpg"/><br/><br/><p><a class="tumblr_blog" href="http://obviousplant.tumblr.com/post/149329489293"
	// target="_blank">obviousplant</a>:</p> <blockquote> <p>Try it, it’s fun!</p> </blockquote> <p>“Can you pass me the sex salt?”</p>
	// </description>
	public Media findOrNew(SyndContent description) {
		Media media = null;
		switch (description.getType()
			.toLowerCase()) {
		case "":
		default:
			log.debug("findOrNew: type: " + description.getType());
			break;
		}
		return media;
	}

}
