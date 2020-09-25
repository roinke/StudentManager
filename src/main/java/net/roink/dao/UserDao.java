package net.roink.dao;

import java.util.List;
import java.util.Map;

import net.roink.entity.User;

public interface UserDao {
    int create(User pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<User> query(Map<String, Object> paramMap);

    User detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);
}