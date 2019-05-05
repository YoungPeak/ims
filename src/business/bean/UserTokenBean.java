package business.bean;

import java.util.Date;

public class UserTokenBean {
	private String id;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 
	 */
	private String access_token;
	/**
	 * 网盘id
	 */
	private String netdiskId;
	
	private String refresh_token;
	/**
	 * accessToken获取或更新的时间
	 */
	private Date time;
	/**
	 * accessToken生命周期,以秒为单位
	 */
	private long expire;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	public long getExpire() {
		return expire;
	}
	public void setExpire(long expire) {
		this.expire = expire;
	}
	public String getNetdiskId() {
		return netdiskId;
	}
	public void setNetdiskId(String netdiskId) {
		this.netdiskId = netdiskId;
	}
	
}
