package net.roink.dao;

import net.roink.entity.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    int create(Student pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Student> query(Map<String, Object> paramMap);

    Student detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);

    List<HashMap> querySelectStudent(Map<String, Object> paramMap);

    List<Student> queryStudentByTeacher(Map<String, Object> paramMap);
}