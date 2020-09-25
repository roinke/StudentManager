package net.roink.dao;

import net.roink.entity.Job;

import java.util.List;
import java.util.Map;

public interface JobDao {
    int create(Job pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Job> query(Map<String, Object> paramMap);

    Job detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);
}