package business.element;

/**
 * 存放用户基本信息，该对象会被存放在ThreadLocal对象中
 * @author ruifeng.yuan
 *
 */
public class LoginElement {
	private String userId;
	private String username;

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
