package com.mikeco.readazzler.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mikeco.readazzler.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public List<User> findByName(String name);
}
