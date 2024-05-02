
package com.example.ques1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ques1.Model.Article;
import com.example.ques1.Repository.ArticleRepository;



@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepositary;

    public List<Article> saveAllArticeles( List<Article> articles )
    {
        return articleRepositary.saveAll(articles);
    }

    public List<Article> findPageSort(int pgNo,int pageSize, String field)
    {
        return articleRepositary.findAll(PageRequest.of(pgNo, pageSize).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
        
    }
}
