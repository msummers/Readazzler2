package com.mikeco.readazzler.models;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Feed {
	@GraphId
	private Long id;
	
	@Relationship
	List<Entry> entries;
	@Relationship(type="LikedEntry")
	List<Entry> likedEntries;
//	@Relationship(type="OriginalEntry")
//	List<Entry> originalEntries;
//	@Relationship(type="RebloggedEntry")
//	List<Entry> rebloggedEntries;
//	@Relationship(type="LikedEntry")
//	List<Entry> likedEntries;
	
}
