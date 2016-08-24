package com.mikeco.readazzler.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikeco.readazzler.models.Entry;
import com.mikeco.readazzler.models.Media;
import com.mikeco.readazzler.repositories.EntryRepository;
import com.rometools.rome.feed.synd.SyndEntry;

@Service
public class EntryService {
	Logger log = LoggerFactory.getLogger(EntryService.class);
	@Autowired
	EntryRepository entryRepo;
	@Autowired
	MediaService mediaService;
	
	public Entry findOrNew(SyndEntry syndEntry) {
		Entry entry = entryRepo.findSingletonByGuid(syndEntry.getLink());
		// Already processed this feed entry?
		if(entry != null)
			return entry;
		entry = fromSyndEntry(syndEntry);
		entryRepo.save(entry);
		return entry;
	}

	private Entry fromSyndEntry(SyndEntry syndEntry) {
		Entry entry = new Entry();
		// Fill-in the blanks
		// Deal with the Media
		Media media = mediaService.findOrNew(syndEntry.getDescription());
		entry.getMedia().add(media);
		return entry;
	}
}