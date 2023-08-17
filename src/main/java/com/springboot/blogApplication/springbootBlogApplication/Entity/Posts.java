package com.springboot.blogApplication.springbootBlogApplication.Entity;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Posts")
public class Posts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "title", nullable = true)
	String title;

	@Column(name = "description", nullable = true)
	String description;

	@Column(name = "content", nullable = true)
	String content;


//	public Posts(long id2) {
//		this.id = id2;
//		// TODO Auto-generated constructor stub
//	}
//	public Posts() {
////		this.id = id2;
//		// TODO Auto-generated constructor stub
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
