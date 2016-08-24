package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.rometools.rome.feed.synd.SyndEntry;

@NodeEntity
public class Entry {
	private String category;
	private String description;
	@Relationship
	private Feed feed;
	private String guid;
	@GraphId
	private Long id;
	private Boolean isRead = false;

	@Relationship(type = "LikedEntry")
	private List<Feed> likes = new ArrayList<Feed>();

	private String link;

	@Relationship
	private List<Media> media = new ArrayList<Media>();

	private Date pubDate; // Mon, 22 Aug 2016 11:20:33 -0700

	@Relationship(type = "RebloggedEntry")
	private List<Entry> reblogs = new ArrayList<Entry>();

	private String title;

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public Feed getFeed() {
		return feed;
	}

	public String getGuid() {
		return guid;
	}

	public Long getId() {
		return id;
	}

	public List<Feed> getLikes() {
		return likes;
	}

	public String getLink() {
		return link;
	}

	public List<Media> getMedia() {
		return media;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public List<Entry> getReblogs() {
		return reblogs;
	}

	public String getTitle() {
		return title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLikes(List<Feed> likes) {
		this.likes = likes;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public void setReblogs(List<Entry> reblogs) {
		this.reblogs = reblogs;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}
}
