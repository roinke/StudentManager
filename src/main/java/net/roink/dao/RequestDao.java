package net.roink.dao;

import net.roink.entity.Request;

import java.util.List;
import java.util.Map;

public interface RequestDao {
    int create(Request pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Request> query(Map<String, Object> paramMap);

    Request detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);
}