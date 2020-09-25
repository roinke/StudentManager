package net.roink.dao;

import net.roink.entity.Score;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ScoreDao {
    int create(Score pi);

    int delete(Map<String, Object> paramMap);

    int update(Map<String, Object> paramMap);

    List<Score> query(Map<String, Object> paramMap);

    Score detail(Map<String, Object> paramMap);

    int count(Map<String, Object> paramMap);

    List<HashMap> queryAvgScoreBySection(Map<String, Object> paramMap);

    List<HashMap> queryScoreByStudent(Map<String, Object> paramMap);
}