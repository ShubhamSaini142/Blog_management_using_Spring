package com.springboot.blogApplication.springbootBlogApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends Exception {

	private String ResourceName;
	private String FieldName;
	private String FieldValue;

	public ResourceNotFound(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s is not found with  %s : %s", resourceName, fieldName, fieldValue));
		ResourceName = resourceName;
		FieldName = fieldName;
		FieldValue = fieldValue;
	}

	public String getResourceName() {
		return ResourceName;
	}

	public String getFieldName() {
		return FieldName;
	}

	public String getFieldValue() {
		return FieldValue;
	}

}
