package net.baiyw.killfocus.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import net.baiyw.killfocus.dao.BaseDao;
import net.baiyw.killfocus.dao.ScoreDao;
import net.baiyw.killfocus.pojo.Score;

@Repository
@Lazy
public class ScoreDaoImpl extends BaseDao implements ScoreDao {

	public ScoreDaoImpl(){
		this.setNamespace("Score");
	}
	
	@Override
	public Score getById(int id) {
		return (Score) this.queryForObject("getScoreByid", id);
	}

	@Override
	public void insert(Score score) {
		this.insert("insertScore", score);
	}

	@Override
	public List<Score> getListByParams(Map<String, Object> map) {
		Map<String, Object> params = new HashMap<String, Object>(map);
		params.put("offset", map.get("offset"));
		params.put("size", map.get("size"));
		return (List<Score>) this.queryForList("getScoreList", params);
	}

	@Override
	public int getCount(Map<String, Object> params) {
		return (Integer) this.queryForObject("getCount", params);
	}

}
