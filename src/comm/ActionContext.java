package comm;

import business.element.LoginElement;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class ActionContext {
	private static ThreadLocal<UserContext> local;

	public static void setThreadLocal(UserContext userContext) {
		local = new ThreadLocal<UserContext>();
		local.set(userContext);
	}

	public static UserContext getThreadLocal() {
		return local.get();
	}

	public static HttpSession getHttpSession() {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest().getSession();
		return session;
	}
	public static UserContext getUserContext(){
		HttpSession session = getHttpSession();
		UserContext context = null;
		if(null != session){
			context = (UserContext)session.getAttribute("usercontext");
		}
		return context;
	}
	public static LoginElement getLoginElement(){
		HttpSession session = getHttpSession();
		LoginElement ele = null;
		if(null != session){
			ele = (LoginElement)session.getAttribute("userinfo");
		}
		return ele;
	}
}
