package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Tag {
	@Relationship(type = "TaggedEntry")
	private List<Entry> entries = new ArrayList<Entry>();;
	@GraphId
	private Long id;
	private String label;

	public List<Entry> getEntries() {
		return entries;
	}

	public Long getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
