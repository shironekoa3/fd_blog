package store.longyan.dao;

import org.springframework.stereotype.Repository;
import store.longyan.domain.Article;

import java.util.List;


@Repository
public interface ArticleDao {

    List<Article> findAll();

    Article findByArticleId(int article_id);

    void removeById(int article_id);

    int saveArticle(Article article);

    int updateArticle(Article article);
}
