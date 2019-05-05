package business.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * SpringMVC返回值存放类
 * 
 * @author  袁瑞峰
 * @version  [v 1.0, 2014-4-9]
 */
public class ReturnObject {
	private Map<String, Object> retObjects = new HashMap<String, Object>(10);

	public void setRetCode(int retCode) {
		this.retObjects.put("retCode", Integer.valueOf(retCode));
	}

	public int getRetCode() {
		Object retcode = this.retObjects.get("retCode");

		if (retcode == null) {
			return 0;
		}
		return Integer.parseInt(retcode.toString());
	}

	public void setRetObject(String key, Object object) {
		this.retObjects.put(key, object);
	}

	public Object getRetObject(String key) {
		return this.retObjects.get(key);
	}

	public void setSuccess(Boolean value) {
		this.retObjects.put("success", value);
	}

	public Boolean getSuccess() {
		boolean rtn = false;
		if ((this.retObjects.get("success") != null)
				&& ("true".equalsIgnoreCase(this.retObjects.get("success")
						.toString()))) {
			rtn = true;
		} else {
			rtn = false;
		}
		return Boolean.valueOf(rtn);
	}

	public Map<String, Object> returnResult() {
		return this.retObjects;
	}
}
