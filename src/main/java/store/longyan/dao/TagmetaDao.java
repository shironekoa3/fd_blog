package store.longyan.dao;

import org.springframework.stereotype.Repository;
import store.longyan.domain.Tag;
import store.longyan.domain.Tagmeta;

import java.util.List;

@Repository
public interface TagmetaDao {

    List<Tag> findAll();

    int saveTagmetaList(List<Tagmeta> tagmetaList);

    int deleteByArticleId(int article_id);
}
