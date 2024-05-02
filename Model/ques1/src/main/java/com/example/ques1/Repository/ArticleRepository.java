package com.example.ques1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ques1.Model.Article;

public interface ArticleRepository extends JpaRepository<Article, String>
{
    
}
