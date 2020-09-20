package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.TagmetaDao;
import store.longyan.domain.Tag;
import store.longyan.domain.Tagmeta;

import java.util.List;

@Service
public class TagmetaService {

    @Autowired
    private TagmetaDao tagmetaDao;

    public List<Tag> findAll(){
        return tagmetaDao.findAll();
    }

    public int saveTagmetaList(List<Tagmeta> tagmetaList){
        return tagmetaDao.saveTagmetaList(tagmetaList);
    }

}
