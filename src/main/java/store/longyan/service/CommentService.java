package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.CommentDao;
import store.longyan.domain.Comment;

import java.util.List;


@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;


    public List<Comment> findAll(){
        return commentDao.findAll();
    }

    public void removeById(int comment_id){
        commentDao.removeById(comment_id);
    }
}
