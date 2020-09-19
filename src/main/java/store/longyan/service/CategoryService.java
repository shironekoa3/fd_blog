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

    public void saveCategory(Category category){
        categoryDao.saveCategory(category);
    }

    public void updateCategory(Category category){
        categoryDao.updateCategory(category);
    }

}
