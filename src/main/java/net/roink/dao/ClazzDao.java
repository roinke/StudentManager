package net.roink.dao;

import net.roink.entity.Clazz;

import java.util.List;
import java.util.Map;

/**
 * @author unusual
 */
public interface ClazzDao {
    int create(Clazz pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Clazz> query(Map<String, Object> paramMap);

    Clazz detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);
}