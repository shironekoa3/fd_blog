package store.longyan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.service.ArticleService;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/getArticle", method = RequestMethod.GET)
    public HashMap<String,Object> getWebsiteInfo(){
        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", articleService.findAll());
        return result;
    }
}
