package store.longyan.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import store.longyan.domain.Category;
import store.longyan.domain.Tag;
import store.longyan.service.ArticleService;
import store.longyan.service.CategoryService;
import store.longyan.service.OptionService;
import store.longyan.service.TagService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMain {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private OptionService optionService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private TagService tagService;

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
    }

    @Test
    public void test4() {
        Category category = new Category();
        category.setCategory_id(5);
        category.setCategory_name("音乐");
        categoryService.updateCategory(category);
    }

    @Test
    public void test5() {
        //测试标签查询所有
        //System.out.println(tagService.findAll());

        Tag tag = new Tag();
        tag.setTag_id(6);
        tag.setTag_name("html");

        //tagService.saveTag(tag);

        //tagService.updateTag(tag);

        tagService.removeById(6);
    }

}