package store.longyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.service.CommentService;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public HashMap<String,Object> list(){

        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", commentService.findAll());

        return result;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public HashMap<String, Object> delete(int comment_id) {

        commentService.removeById(comment_id);
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", 200);

        return result;
    }

}
