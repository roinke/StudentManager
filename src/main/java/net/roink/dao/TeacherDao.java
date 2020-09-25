package net.roink.dao;

import net.roink.entity.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherDao {
    int create(Teacher pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Teacher> query(Map<String, Object> paramMap);

    Teacher detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);
}