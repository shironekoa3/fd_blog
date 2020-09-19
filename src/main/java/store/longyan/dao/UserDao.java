package store.longyan.dao;

import org.springframework.stereotype.Repository;
import store.longyan.domain.User;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();

    User findManagerUser();

}
