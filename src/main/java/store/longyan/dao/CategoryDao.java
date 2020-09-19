package store.longyan.dao;


import org.springframework.stereotype.Repository;
import store.longyan.domain.Category;

import java.util.List;

@Repository
public interface CategoryDao {

    List<Category> findAll();

    void removeById(int category_id);

    void saveCategory(Category category);
}
