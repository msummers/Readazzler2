package com.mikeco.readazzler.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Entry {
	private String category;
	private String description;
	@ManyToOne
	private Feed feed;
	private String guid;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToMany
	private List<Feed> likedBy = new ArrayList<Feed>();

	// <description>
	// <img src="http://66.media.tumblr.com/e696291bd37abe4161c5e67a0a07d02c/tumblr_ocbpciDt6E1u53c30o1_500.jpg"/><br/><br/><p><a class="tumblr_blog" href="http://obviousplant.tumblr.com/post/149329489293"
	// target="_blank">obviousplant</a>:</p> <blockquote> <p>Try it, it’s fun!</p> </blockquote> <p>“Can you pass me the sex salt?”</p>
	// </description>
	private String link;

	@ManyToMany
	private List<Media> media = new ArrayList<Media>();

	private Date pubDate; // Mon, 22 Aug 2016 11:20:33 -0700

	@OneToMany(mappedBy = "id")
	private List<Entry> reblogs = new ArrayList<Entry>();

	@ManyToMany
	private List<Tag> tags = new ArrayList<Tag>();

	private String title;

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public Feed getFeed() {
		return feed;
	}

	public String getGuid() {
		return guid;
	}

	public Long getId() {
		return id;
	}

	public List<Feed> getLikedBy() {
		return likedBy;
	}

	public String getLink() {
		return link;
	}

	public List<Media> getMedia() {
		return media;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public List<Entry> getReblogs() {
		return reblogs;
	}

	public String getTitle() {
		return title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLikedBy(List<Feed> likes) {
		this.likedBy = likes;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public void setReblogs(List<Entry> reblogs) {
		this.reblogs = reblogs;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
