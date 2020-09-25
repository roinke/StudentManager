package net.roink.dao;

import net.roink.entity.Subject;

import java.util.List;
import java.util.Map;

public interface SubjectDao {
    int create(Subject pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Subject> query(Map<String, Object> paramMap);

    Subject detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);
}