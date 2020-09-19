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

    public void saveTag(Tag tag){
        tagDao.saveTag(tag);
    }

    public void updateTag(Tag tag){
        tagDao.updateTag(tag);
    }

    public void removeById(int tag_id){
        tagDao.removeById(tag_id);
    }
}
