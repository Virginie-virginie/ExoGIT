package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Article;

public interface IArticleService {
	
	public List <Article> findAll();
	
	public Article FindOne(Long idArticle);
	
	public Article Save(Article article);
	
	public void delete (Long idArticle);

}
