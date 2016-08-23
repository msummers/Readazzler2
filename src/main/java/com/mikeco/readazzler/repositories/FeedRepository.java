package com.mikeco.readazzler.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mikeco.readazzler.models.Feed;

public interface FeedRepository extends CrudRepository<Feed, Long> {
	public List<Feed> findByRssUrl(String rssUrl);
}
