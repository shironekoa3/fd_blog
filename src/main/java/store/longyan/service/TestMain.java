package store.longyan.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import store.longyan.dao.TagDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMain {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void test1() {
        System.out.println(articleService.findAll());
    }

    @Test
    public void test2() {
        System.out.println(categoryService.findAll());
    }

}
