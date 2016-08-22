package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Folder {
	@GraphId
	private Long id;
	@Relationship
	private List<Feed> feeds = new ArrayList<Feed>();
	private String label;
	@Relationship
	private List<Folder> subFolders = new ArrayList<Folder>();
	@Relationship
	private Folder parentFolder;

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
