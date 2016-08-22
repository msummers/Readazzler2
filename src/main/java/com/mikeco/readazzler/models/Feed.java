package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Feed {
	@Relationship
	private List<Entry> entries = new ArrayList<Entry>();
	@Relationship
	private List<Folder> folders = new ArrayList<Folder>();
	@GraphId
	private Long id;
	@Relationship(type = "LikedEntry", direction = Relationship.UNDIRECTED)
	private List<Entry> likedEntries = new ArrayList<Entry>();
	private String rssUrl;
	private String siteUrl;
	private String title;
	private String type;

	public Feed() {

	}

	public Feed(String type, String title, String xmlUrl, String htmlUrl) {
		this.type = type;
		this.title = title;
		this.rssUrl = xmlUrl;
		this.siteUrl = htmlUrl;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public Long getId() {
		return id;
	}

	public List<Entry> getLikedEntries() {
		return likedEntries;
	}

	public String getRssUrl() {
		return rssUrl;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLikedEntries(List<Entry> likedEntries) {
		this.likedEntries = likedEntries;
	}

	public void setRssUrl(String rssUrl) {
		this.rssUrl = rssUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

}
