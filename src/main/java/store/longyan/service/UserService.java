package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.UserDao;
import store.longyan.domain.User;

import java.util.HashMap;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public List<User> findAll(){
        return userDao.findAll();
    }

    public User findManagerUser(){
        return userDao.findManagerUser();
    }

    public HashMap<String,Object> getManagerInfo(){
        User managerUser = findManagerUser();

        HashMap<String,Object> data = new HashMap<>();
        data.put("nickname", managerUser.getNickname());
        data.put("img_url", managerUser.getImage_url());
        data.put("profile", managerUser.getProfile());

        return data;
    }

}
