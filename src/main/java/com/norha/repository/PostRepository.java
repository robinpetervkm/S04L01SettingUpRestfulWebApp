package com.norha.repository;

import org.springframework.data.repository.CrudRepository;

import com.norha.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
