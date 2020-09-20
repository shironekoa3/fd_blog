package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.ArticleDao;
import store.longyan.dao.CategoryDao;
import store.longyan.dao.TagDao;
import store.longyan.dao.TagmetaDao;
import store.longyan.domain.Article;
import store.longyan.domain.Tagmeta;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private TagDao tagDao;

    @Autowired
    private TagmetaDao tagmetaDao;

    public List<Article> findAll() {
        return articleDao.findAll();
    }

    public Article findByArticleId(int article_id){
        return articleDao.findByArticleId(article_id);
    }

    public void removeById(int article_id) {
        articleDao.removeById(article_id);
    }

    public boolean saveArticle(Article article) {
        if (article == null) {
            return false;
        }

        // 如果是新的分类，则新增分类
        if (article.getCategory_id() == 0) {
            if(article.getCategory().getCategory_id() == 0){
                categoryDao.saveCategory(article.getCategory());
            }
            article.setCategory_id(article.getCategory().getCategory_id());
        }

        // 如果标签里面有新的标签则新增标签
        if (article.getTagList().size() > 0) {
            article.getTagList().forEach(item -> {
                if (item.getTag_id() == 0) {
                    tagDao.saveTag(item);
                }
            });
        }

        // 新增文章
        articleDao.saveArticle(article);

        // 将新增的文章与标签建立关系
        List<Tagmeta> tagmetaList = new ArrayList<>();
        article.getTagList().forEach(item -> {
            tagmetaList.add(new Tagmeta(article.getArticle_id(), item.getTag_id()));
        });
        if(tagmetaList.size()>0){
            tagmetaDao.saveTagmetaList(tagmetaList);
        }

        return true;
    }

    public boolean updateArticle(Article article) {
        if (article.getArticle_id() == 0) {
            return false;
        }

        // 如果是新的分类，则新增分类
        if (article.getCategory_id() == 0) {
            if(article.getCategory().getCategory_id() == 0){
                categoryDao.saveCategory(article.getCategory());
            }
            article.setCategory_id(article.getCategory().getCategory_id());
        }

        // 如果标签里面有新的标签则新增标签
        if (article.getTagList().size() > 0) {
            article.getTagList().forEach(item -> {
                if (item.getTag_id() == 0) {
                    tagDao.saveTag(item);
                }
            });
        }

        // 更新文章
        articleDao.updateArticle(article);

        // 将文章与标签建立关系
        tagmetaDao.deleteByArticleId(article.getArticle_id());
        List<Tagmeta> tagmetaList = new ArrayList<>();
        article.getTagList().forEach(item -> {
            tagmetaList.add(new Tagmeta(article.getArticle_id(), item.getTag_id()));
        });
        if(tagmetaList.size()>0){
            tagmetaDao.saveTagmetaList(tagmetaList);
        }

        return true;

    }
}
