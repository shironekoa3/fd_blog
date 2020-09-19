package store.longyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.domain.Tag;
import store.longyan.service.TagService;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public HashMap<String, Object> list(){
        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", tagService.findAll());
        return result;
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    public HashMap<String, Object> save(Tag tag){
        tagService.saveTag(tag);

        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    public HashMap<String, Object> update(Tag tag){
        tagService.updateTag(tag);

        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        return result;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET, produces =
            "application/json;charset=utf-8")
    public HashMap<String, Object> delete(int tag_id){
        tagService.removeById(tag_id);

        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        return result;
    }

}
