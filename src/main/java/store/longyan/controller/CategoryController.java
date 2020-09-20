package store.longyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.domain.Category;
import store.longyan.service.CategoryService;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public HashMap<String,Object> list(){

        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", categoryService.findAll());

        return result;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public HashMap<String, Object> delete(int category_id){

        categoryService.removeById(category_id);
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", 200);

        return result;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public HashMap<String, Object> save(@RequestBody Category category) {

        categoryService.saveCategory(category);

        HashMap<String, Object> result = new HashMap<>();
        result.put("status", 200);

        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public HashMap<String, Object> update(@RequestBody Category category) {

        categoryService.updateCategory(category);

        HashMap<String, Object> result = new HashMap<>();
        result.put("status", 200);

        return result;
    }
}
