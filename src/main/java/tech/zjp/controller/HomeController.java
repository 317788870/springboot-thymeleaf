package tech.zjp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @Author: zhoujunpeng
 * @Date: 2018年7月14日 下午4:46:22
 */
@RestController
public class HomeController {

	@RequestMapping("/index")
	public ModelAndView toIndex() {
		return new ModelAndView("index").addObject("msg", "测试成功");
	}
}
