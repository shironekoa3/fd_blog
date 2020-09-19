package store.longyan.dao;

import store.longyan.domain.Tag;

public interface TagDao {

    void saveTag(Tag tag);

    void updateTag(Tag tag);
}
