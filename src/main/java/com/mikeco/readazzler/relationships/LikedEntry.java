package com.mikeco.readazzler.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.mikeco.readazzler.models.Entry;
import com.mikeco.readazzler.models.Feed;

@RelationshipEntity(type="LikedEntry")
public class LikedEntry {
	@GraphId
	private Long id;
	@StartNode
	private Entry entry;
	@EndNode
	private Feed feed;
}
