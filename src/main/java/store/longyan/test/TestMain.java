package store.longyan.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
        categoryService.removeById(8);
        System.out.println(categoryService.findAll());
    }

    @Test
    public void test4() {
        Category category = new Category();
        category.setCategory_id(5);
        category.setCategory_name("音乐");
        categoryService.updateCategory(category);
    }
}
