package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Feed {
	@OneToMany(mappedBy="feed")
	private List<Entry> entries = new ArrayList<Entry>();
	@ManyToMany
	private List<Folder> folders = new ArrayList<Folder>();
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToMany
	private List<Entry> likes = new ArrayList<Entry>();
	private String rssUrl;
	private String siteUrl;
	private String title;
	private String type;

	@ManyToOne
	private User user;
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

	public User getUser() {
		return user;
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

	public void setUser(User user) {
		this.user = user;
	}

}
