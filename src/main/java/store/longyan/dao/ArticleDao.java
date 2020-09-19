package store.longyan.dao;

import org.springframework.stereotype.Repository;
import store.longyan.domain.Article;

import java.util.List;


@Repository
public interface ArticleDao {

    List<Article> findAll();

    void removeById(int article_id);

    void saveArticle(Article article);
}
