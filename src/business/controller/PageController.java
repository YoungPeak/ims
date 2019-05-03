package business.controller;

import business.element.LoginElement;
import comm.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();

		Map<String, Object> rs = new HashMap<String, Object>();

		LoginElement ele = ActionContext.getLoginElement();
		//rs.put("username",ele.getUsername());
		rs.put("username","test");
		mv.setViewName("/index.jsp");
		mv.addAllObjects(rs);
		
		return mv;
	}
	
}
