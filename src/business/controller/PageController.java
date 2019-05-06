package business.controller;

import business.bean.UserBean;
import business.element.LoginElement;
import business.service.UserService;
import comm.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();

		Map<String, Object> rs = new HashMap<String, Object>();

		UserBean user = userService.findUserByName("admin");
		//System.out.println(user);

		LoginElement ele = ActionContext.getLoginElement();
		//rs.put("username",ele.getUsername());
		rs.put("username", user.getName());
		mv.setViewName("/index.jsp");
		mv.addAllObjects(rs);
		
		return mv;
	}

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	@ResponseBody
	public UserBean test(@RequestParam("username") String username) {
		System.out.println(username);
		UserBean user = userService.findUserByName(username);
		System.out.println(user);

		return user;
	}
}
