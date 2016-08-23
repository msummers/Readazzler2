package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {
	@OneToMany(mappedBy="user")
	private List<Feed> discoveredFeeds = new ArrayList<Feed>();

	@OneToMany(mappedBy="user")
	private List<Folder> folders = new ArrayList<Folder>();

	@OneToMany(mappedBy="user")
	private List<Feed> followedFeeds = new ArrayList<Feed>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
