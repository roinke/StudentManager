package net.roink.dao;

import net.roink.entity.Section;

import java.util.List;
import java.util.Map;

public interface SectionDao {
    int create(Section pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Section> query(Map<String, Object> paramMap);

    Section detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);

    List<Section> queryByStudent(Map<String, Object> paramMap);

    List<Section> queryByTeacher(Map<String, Object> paramMap);
}