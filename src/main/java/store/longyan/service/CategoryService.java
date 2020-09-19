package store.longyan.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.CategoryDao;
import store.longyan.domain.Category;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findAll(){
        return categoryDao.findAll();
    }

    public void removeById(int category_id){
        categoryDao.removeById(category_id);
    }

    public void saveCategory(String category_name){
        Category category = new Category();
        category.setCategory_name(category_name);
        categoryDao.saveCategory(category);
    }

}
