package com.springboot.blogApplication.springbootBlogApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.blogApplication.springbootBlogApplication.Entity.Posts;

public interface PostRepositery extends JpaRepository<Posts, Long>{

}
