package com.norha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.norha.entity.Post;
import com.norha.repository.PostRepository;

@Service
public class PostsService {
	
	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getPosts(){
		return (List<Post>) postRepository.findAll();
	}

	public Post getPost(int id) {
		return postRepository.findById(id).get();
	}
	
	public void addPost(Post post) {
		postRepository.save(post);
	}
	
	public void updatePost(Post post) {
		postRepository.save(post);
	}
	
	public void deletePost(int id) {
		postRepository.deleteById(id);
	}
}
