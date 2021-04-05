package com.wolken.wolkenapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class InstagramBean {
	@Value("abcd")
	private String instaId;
	@Value("23")
	private int noOfPosts;
	@Autowired
	private MemesBean memesBean;
	
	public void insta() {
		System.out.println("welecome to instagram");
	}

}
