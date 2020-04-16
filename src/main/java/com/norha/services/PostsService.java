package com.norha.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.norha.entity.Post;

@Service
public class PostsService {
	List<Post> posts = new ArrayList<>();
	public PostsService() {
		posts.add(new Post(1, "DataType", "Sample Text1"));
		posts.add(new Post(2, "Classes", "Sample Text2"));
		posts.add(new Post(3, "Object", "Sample Text3"));
		posts.add(new Post(4, "Access Types", "Sample Text4"));
		posts.add(new Post(5, "OOPS Overview", "Sample Text5"));
		posts.add(new Post(6, "Data base", "Sample Text6"));
		posts.add(new Post(7, "Ejb", "Sample Text7"));
	}
	
	public List<Post> getPosts(){
		return posts;
	}

	public Post getPost(int id) {
		for (Post post : posts) {
			if(post.getPostId()==id) {
				return post;
			}
		}
		return null;
	}

}
