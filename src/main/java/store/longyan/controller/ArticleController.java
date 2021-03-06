package store.longyan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.domain.Article;
import store.longyan.service.ArticleService;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public HashMap<String,Object> list(){
        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", articleService.findAll());
        return result;
    }

    @RequestMapping(value = "/searchById", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public HashMap<String,Object> searchById(int article_id){
        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", articleService.findByArticleId(article_id));
        return result;
    }



    @RequestMapping(value = "/delete", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public HashMap<String, Object> delete(int article_id){
        articleService.removeById(article_id);
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", 200);
        return result;
    }



    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public HashMap<String, Object> save(@RequestBody Article article) {

        articleService.saveArticle(article);

        HashMap<String, Object> result = new HashMap<>();
        result.put("status", 200);
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public HashMap<String, Object> update(@RequestBody Article article) {

        articleService.updateArticle(article);

        HashMap<String, Object> result = new HashMap<>();
        result.put("status", 200);
        return result;
    }


}
