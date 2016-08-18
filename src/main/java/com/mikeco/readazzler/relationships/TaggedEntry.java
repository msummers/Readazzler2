package com.mikeco.readazzler.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.mikeco.readazzler.models.Entry;
import com.mikeco.readazzler.models.Tag;

@RelationshipEntity(type="TaggedEntry")
public class TaggedEntry {
	@GraphId
	private Long id;
	@EndNode
	private Entry entry;
	@StartNode
	private Tag tag;
}
