package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Article;
import com.inti.repository.ArticleRepository;
import com.inti.service.interfaces.IArticleService;
@Service
public class ArticleService implements IArticleService {
	
	@Autowired
	ArticleRepository articleRepository;
	
	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	@Override
	public Article FindOne(Long idArticle) {
		return articleRepository.findById(idArticle).orElse(null);
	}

	@Override
	public Article Save(Article article) {
		return articleRepository.save(article);
	}

	@Override
	public void delete(Long idArticle) {
		articleRepository.deleteById(idArticle);
		
	}


}
