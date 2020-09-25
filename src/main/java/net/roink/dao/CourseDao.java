package net.roink.dao;

import net.roink.entity.Course;

import java.util.List;
import java.util.Map;

/**
 * @author unusual
 */
public interface CourseDao {

    int create(Course pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Course> query(Map<String, Object> paramMap);

    Course detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);

}