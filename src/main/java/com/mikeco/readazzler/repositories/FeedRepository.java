package com.mikeco.readazzler.repositories;

import java.util.List;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.mikeco.readazzler.models.Feed;

public interface FeedRepository extends GraphRepository<Feed> {
	public List<Feed> findByRssUrl(String rssUrl);
}
