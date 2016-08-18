package com.mikeco.readazzler.models;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity

public class Media {
	@GraphId
	private Long id;
	@Relationship
	private List<Entry> entries;

}