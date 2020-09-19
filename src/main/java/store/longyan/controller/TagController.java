package store.longyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.service.TagService;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public HashMap<String,Object> list(){

        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", tagService.findAll());

        return result;
    }



}
