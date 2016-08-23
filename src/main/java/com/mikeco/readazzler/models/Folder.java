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
import javax.persistence.OneToOne;


@Entity
public class Folder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToMany
	private List<Feed> feeds = new ArrayList<Feed>();
	private String label;
	@OneToMany(mappedBy="parentFolder")
	private List<Folder> subFolders = new ArrayList<Folder>();
	@ManyToOne
	private Folder parentFolder;

	@ManyToOne
	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Feed> getFeeds() {
		return feeds;
	}

	public Long getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public Folder getParentFolder() {
		return parentFolder;
	}

	public List<Folder> getSubFolders() {
		return subFolders;
	}

	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setParentFolder(Folder parentFolder) {
		this.parentFolder = parentFolder;
	}

	public void setSubFolders(List<Folder> subFolders) {
		this.subFolders = subFolders;
	}
}
