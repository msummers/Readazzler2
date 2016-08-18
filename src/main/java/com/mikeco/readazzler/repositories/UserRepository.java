package com.mikeco.readazzler.repositories;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.mikeco.readazzler.models.User;

public interface UserRepository extends GraphRepository<User> {
}
