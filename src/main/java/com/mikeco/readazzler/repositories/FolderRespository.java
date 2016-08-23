package com.mikeco.readazzler.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mikeco.readazzler.models.Folder;

public interface FolderRespository extends CrudRepository<Folder,Long> {
	public List<Folder> findByLabel(String label);
}
