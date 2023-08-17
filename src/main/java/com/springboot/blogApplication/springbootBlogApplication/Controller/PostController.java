package com.springboot.blogApplication.springbootBlogApplication.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.digit.spring.ApplicationDemo.springbootdemo.Bean.Student;
import com.springboot.blogApplication.springbootBlogApplication.Entity.Posts;
import com.springboot.blogApplication.springbootBlogApplication.PayloadDTO.PostDTO;
import com.springboot.blogApplication.springbootBlogApplication.Repository.PostRepositery;
import com.springboot.blogApplication.springbootBlogApplication.Service.PostServices;
import com.springboot.blogApplication.springbootBlogApplication.Service.ServiceImpl.PostServiceImpl;

@RestController
@RequestMapping("/api/post")
public class PostController {

	private PostServices postService;

	public PostController(PostServices postService) {
		this.postService = postService;
	}

	@PostMapping
	public ResponseEntity<PostDTO> create(@RequestBody PostDTO postDto) {
		return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
	}

	@GetMapping()
	public List<PostDTO> getAllPost() {
		return postService.getAllPosts();

	}

	@GetMapping("/{id}")
	public Posts getPosts(@PathVariable("id") long id) {
		return postService.getPostbyId(id);
	}
     
	   @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable("id") int id) {
		   postService.deleteData(id);
	    }
}
