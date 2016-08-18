package com.mikeco.readazzler.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.mikeco.readazzler.models.Feed;
import com.mikeco.readazzler.models.User;

@RelationshipEntity(type="FollowedFeed")
public class FollowedFeed {
	@GraphId
	private Long id;
	@StartNode
	private User user;
	@EndNode
	private Feed feed;
}
