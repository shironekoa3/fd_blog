package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.TagDao;
import store.longyan.domain.Tag;

import java.util.List;

@Service
public class TagService {
    @Autowired
    private TagDao tagDao;


    public List<Tag> findAll(){
        return tagDao.findAll();
    }

}
