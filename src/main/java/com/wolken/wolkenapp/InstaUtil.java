package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.InstagramBean;
import com.wolken.wolkenapp.bean.MemesBean;

public class InstaUtil {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.xml");
		InstagramBean instagramBean=applicationContext.getBean(InstagramBean.class);
		instagramBean.insta();
		System.out.println(instagramBean.getInstaId()+" "+instagramBean.getNoOfPosts());
		MemesBean memesBean=applicationContext.getBean(MemesBean.class);
		memesBean.memes();
		System.out.println(memesBean.getMemepage()+" "+memesBean.getNoOfFollowers());
	}

}
