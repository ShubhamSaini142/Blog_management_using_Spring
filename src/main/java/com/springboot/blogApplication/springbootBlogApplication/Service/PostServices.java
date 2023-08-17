package com.springboot.blogApplication.springbootBlogApplication.Service;

import java.util.List;

import com.springboot.blogApplication.springbootBlogApplication.Entity.Posts;
import com.springboot.blogApplication.springbootBlogApplication.PayloadDTO.PostDTO;

public interface PostServices {
	PostDTO createPost(PostDTO postdto);
	List<PostDTO> getAllPosts();
	Posts getPostbyId(long id);
	void deleteData(long id);

}
