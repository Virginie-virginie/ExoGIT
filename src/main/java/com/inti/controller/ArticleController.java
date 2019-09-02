package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Article;
import com.inti.service.interfaces.IArticleService;

@RestController
@RequestMapping(value = "/")
public class ArticleController {
	
	@Autowired
	IArticleService articleServ;
	
	@RequestMapping(value = "articles", method = RequestMethod.GET)
	public List<Article> findAll(){
		return articleServ.findAll();
	}
	
	@RequestMapping(value = "articles/{id_article}", method = RequestMethod.GET)
	public Article findOne(@PathVariable ("id_article") Long id_article) {
		return articleServ.FindOne(id_article);
	}
	
	@RequestMapping(value = "articles", method = RequestMethod.POST)
	public Article Save(@RequestBody Article article) {
		return articleServ.Save(article);
	}
	
	@RequestMapping(value = "articles/{id_article", method = RequestMethod.DELETE)
	public void delete(@PathVariable ("id_article") Long id_article) {
		articleServ.delete(id_article);
}
	
	@RequestMapping(value = "articles/{id_article}", method = RequestMethod.PUT)
	public void update (@PathVariable ("id_article") Long id_article, @RequestBody Article article) {
		Article currentArticle = articleServ.FindOne(id_article);
		currentArticle.setLibelle(article.getLibelle());
		currentArticle.setStock(article.getStock());
		currentArticle.setPrix(article.getPrix());
		articleServ.Save(currentArticle);
	}
	
	
	
}
