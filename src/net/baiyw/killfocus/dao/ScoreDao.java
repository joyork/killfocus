package net.baiyw.killfocus.dao;

import java.util.List;
import java.util.Map;

import net.baiyw.killfocus.pojo.Score;

public interface ScoreDao {
	/**
	 * 
	 * @param id
	 * @return
	 */
	Score getById(int id);
	
	/**
	 * ÃÌº”
	 * @param score
	 */
	void insert(Score score);

	/**
	 * ≤È—Ø
	 * @param params
	 * @return
	 */
	List<Score> getListByParams(Map<String,Object> params);
	
	/**
	 * 
	 * @param params
	 * @return
	 */
	int getCount(Map<String, Object> params);
}
