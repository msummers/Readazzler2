package com.mikeco.readazzler.models;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Entry {
	@GraphId
	private Long id;
	@Relationship
	private Feed feed;
	@Relationship(type="LikedEntry")
	private List<Feed> likes;
	@Relationship(type="RebloggedEntry")
	private List<Entry> reblogs;
	@Relationship
	private List<Media> media;
}
