package net.baiyw.killfocus.controller;

import javax.annotation.Resource;
import net.baiyw.killfocus.dao.ScoreDao;
import net.baiyw.killfocus.pojo.Score;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/front")
public class KillFocusController {

	private Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private ScoreDao scoreDao;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/test")
	public ModelAndView test() {
		Score score = scoreDao.getById(1);
		ModelAndView mv = new ModelAndView("front/test");
		mv.addObject("user", score.getName());
		return mv;
	}
}
