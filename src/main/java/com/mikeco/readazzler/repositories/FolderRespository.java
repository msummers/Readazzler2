package com.mikeco.readazzler.repositories;

import java.util.List;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.mikeco.readazzler.models.Folder;

public interface FolderRespository extends GraphRepository<Folder> {
	public List<Folder> findByLabel(String label);
}
