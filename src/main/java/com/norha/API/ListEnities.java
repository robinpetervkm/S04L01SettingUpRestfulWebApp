package com.norha.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListEnities {
	@RequestMapping("listBlogs")
	public String listBlogs() {
		return "listBlogs";
	}

}
