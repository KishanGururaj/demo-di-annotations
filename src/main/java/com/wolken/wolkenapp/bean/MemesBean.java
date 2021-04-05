package com.wolken.wolkenapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class MemesBean {
	@Value("NammaKaranakataMemes")
	private String Memepage;
	@Value("100000")
	private int noOfFollowers;
	
	public void memes() {
		System.out.println("memes ge swagata");
	}
	

}
