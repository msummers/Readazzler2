package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Tag {
	@ManyToMany
	private List<Entry> entries = new ArrayList<Entry>();;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
