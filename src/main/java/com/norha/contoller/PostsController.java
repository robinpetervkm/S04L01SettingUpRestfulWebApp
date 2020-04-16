package com.norha.contoller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.norha.entity.Post;
import com.norha.services.PostsService;
@RestController
public class PostsController {
	
	@RequestMapping("/posts")
 	public List<Post> getPosts(){
		return new PostsService().getPosts();
 	}
	

}
