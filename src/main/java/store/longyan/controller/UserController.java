package store.longyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import store.longyan.domain.User;
import store.longyan.service.UserService;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getManagerInfo", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public HashMap<String,Object> getManagerInfo(){
        HashMap<String,Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("data", userService.getManagerInfo());
        return result;
    }

}
