package store.longyan.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import store.longyan.service.ArticleService;
import store.longyan.service.CategoryService;
import store.longyan.service.OptionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMain {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private OptionService optionService;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void test1() {
        System.out.println(articleService.findAll());
    }

    @Test
    public void test2() {
        articleService.removeById(3);
    }

    @Test
    public void test3() {
        categoryService.removeById(3);
    }

    @Test
    public void test4() {
        categoryService.saveCategory("笔记");
    }
}