package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.ArticleDao;
import store.longyan.domain.Article;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public List<Article> findAll() {
        return articleDao.findAll();
    }

}
