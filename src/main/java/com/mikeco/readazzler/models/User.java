package com.mikeco.readazzler.models;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class User {
	@GraphId
	private Long id;
	@Relationship(type="FollowedFeed")
	private List<Feed> followedFeeds;
	@Relationship(type="DiscoveredFeed")
	private List<Feed> discoveredFeeds;
	public static void loadOpml() {
		// TODO Auto-generated method stub
		
	}
}
