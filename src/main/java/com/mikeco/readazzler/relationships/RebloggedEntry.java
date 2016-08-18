package com.mikeco.readazzler.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.mikeco.readazzler.models.Entry;

@RelationshipEntity(type="RebloggedEntry")
public class RebloggedEntry {
	@GraphId
	private Long id;
	@StartNode
	private Entry original;
	@EndNode
	private Entry reblog;
}
