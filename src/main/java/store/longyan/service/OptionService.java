package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.OptionDao;
import store.longyan.dao.UserDao;
import store.longyan.domain.User;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;

@Service
public class OptionService {

    @Autowired
    private OptionDao optionDao;


    String findValueByOptionName(String name){
        return optionDao.findValueByOptionName(name);
    }

    public HashMap<String,Object> getWebsiteInfo() {
        HashMap<String,Object> data = new HashMap<>();
        data.put("visits", findValueByOptionName("visits"));
        data.put("article_count", findValueByOptionName("article_count"));
        data.put("category_count", findValueByOptionName("category_count"));
        data.put("comment_count", findValueByOptionName("comment_count"));
        return data;
    }

}
