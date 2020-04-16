package com.norha.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.norha.entity.Post;

@Service
public class PostsService {
	static List<Post> posts = new ArrayList<>(
			Arrays.asList(
					new Post(1, "DataType", "Sample Text1"),
					new Post(2, "Classes", "Sample Text2"),
					new Post(3, "Object", "Sample Text3"),
					new Post(4, "Access Types", "Sample Text4"),
					new Post(5, "OOPS Overview", "Sample Text5"),
					new Post(6, "Data base", "Sample Text6"),
					new Post(7, "Ejb", "Sample Text7")
					));
	
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

	public void addPost(Post post) {
		posts.add(post);
	}

}
