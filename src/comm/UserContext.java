package comm;

import business.element.LoginElement;

/**
 * 该对象对被存放在ThreadLocal对象中，该对象存放用户登录信息，网盘操作对象
 * @author 袁瑞峰
 *
 */
public class UserContext {
	/**
	 * 用户信息
	 */
	private LoginElement loginElement;
	
	public LoginElement getLoginElement() {
		return loginElement;
	}
	public void setLoginElement(LoginElement loginElement) {
		this.loginElement = loginElement;
	}
}
