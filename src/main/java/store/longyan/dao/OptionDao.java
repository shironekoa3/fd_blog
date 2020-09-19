package store.longyan.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface OptionDao {


    String findValueByOptionName(String name);
}
