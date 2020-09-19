package store.longyan.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.CategoryDao;
import store.longyan.domain.Category;
import store.longyan.domain.User;

import java.util.HashMap;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findAll(){
        return categoryDao.findAll();
    }

    public HashMap<String,Object> getCateforyInfo(){
        HashMap<String,Object> data = new HashMap<>();
        List<Category> cateforyInfo = findAll();

        for (int i = 0; i < findAll().size(); i++) {
            data.put("category_id", cateforyInfo.get(i).getCategory_id());
            data.put("category_name", cateforyInfo.get(i).getCategory_name());
        }

        return data;
    }
}
