package com.mikeco.readazzler.models;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Tag {
	@GraphId
	private Long id;
	@Relationship(type="TaggedEntry")
	private List<Entry> entries;
	private String label;
}
