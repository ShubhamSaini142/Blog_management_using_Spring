package com.springboot.blogApplication.springbootBlogApplication.Service.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.blogApplication.springbootBlogApplication.Entity.Posts;
import com.springboot.blogApplication.springbootBlogApplication.PayloadDTO.PostDTO;
import com.springboot.blogApplication.springbootBlogApplication.Repository.PostRepositery;
import com.springboot.blogApplication.springbootBlogApplication.Service.PostServices;
@Service
public class PostServiceImpl implements PostServices {

	private PostRepositery postRepositery;

	public PostServiceImpl(PostRepositery postRepositery) {
		this.postRepositery = postRepositery;

	}

	
	private Posts mapFromDTO(PostDTO postDto) {
		Posts post = new Posts();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		return post;
		
		}
	
	private PostDTO mapFromEntity(Posts post) {
		PostDTO postResponse = new PostDTO();
		postResponse.setId(post.getId());
		postResponse.setTitle(post.getTitle());
		postResponse.setDescription(post.getDescription());
		postResponse.setContent(post.getContent());
		return postResponse;
	}
	
	public PostDTO createPost(PostDTO postDto) {
		Posts post = mapFromDTO(postDto);
		Posts postdto1 = postRepositery.save(post);
		PostDTO postResponse = mapFromEntity(postdto1);
		return postResponse;
	}


	@Override
	public List<PostDTO> getAllPosts() {
		// TODO Auto-generated method stub
		List<Posts> post = postRepositery.findAll();
		
		return post.stream().map(posts->mapFromEntity(posts)).collect(Collectors.toList());
	}
	
	public Posts getPostbyId(long id) {
		return postRepositery.findById(id).orElse(null);
	}
	  public void deleteData(long id) {
		  postRepositery.deleteById(id);
	    }

}
