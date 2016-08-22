package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class User {
	@Relationship(type="DiscoveredFeed")
	private List<Feed> discoveredFeeds = new ArrayList<Feed>();

	@Relationship
	private List<Folder> folders = new ArrayList<Folder>();

	@Relationship(type="FollowedFeed")
	private List<Feed> followedFeeds = new ArrayList<Feed>();
	
	@GraphId
	private Long id;

	private String name;

	public List<Feed> getDiscoveredFeeds() {
		return discoveredFeeds;
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public List<Feed> getFollowedFeeds() {
		return followedFeeds;
	}

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setDiscoveredFeeds(List<Feed> discoveredFeeds) {
		this.discoveredFeeds = discoveredFeeds;
	}
	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}
	
	public void setFollowedFeeds(List<Feed> followedFeeds) {
		this.followedFeeds = followedFeeds;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
