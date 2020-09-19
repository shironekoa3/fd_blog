package store.longyan.dao;


import org.springframework.stereotype.Repository;
import store.longyan.domain.Comment;

import java.util.List;

@Repository
public interface CommentDao {

    List<Comment> findAll();

    void removeById(int comment_id);

}
