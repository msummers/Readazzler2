package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity

public class Media {
	@Relationship
	private List<Entry> entries = new ArrayList<Entry>();
	@GraphId
	private Long id;

	public List<Entry> getEntries() {
		return entries;
	}

	public Long getId() {
		return id;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
