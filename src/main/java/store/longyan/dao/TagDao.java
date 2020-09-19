package store.longyan.dao;

import org.springframework.stereotype.Repository;
import store.longyan.domain.Tag;

import java.util.List;

@Repository
public interface TagDao {

    List<Tag> findAll();

    void saveTag(Tag tag);

    void updateTag(Tag tag);
}
