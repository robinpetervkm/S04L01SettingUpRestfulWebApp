package com.norha.contoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.norha.entity.Post;
import com.norha.services.PostsService;
@RestController
public class PostsController {
	
	@Autowired
	private PostsService postsService;
	
	@RequestMapping("/posts")
 	public List<Post> getPosts(){
		return postsService.getPosts();
 	}
	
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable("id") int id) {
		return postsService.getPost(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post post) {
		postsService.addPost(post);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	public void updatePost(@RequestBody Post post) {
		postsService.updatePost(post);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	public void deletePost(@PathVariable int id) {
		postsService.deletePost(id);
	}

}
