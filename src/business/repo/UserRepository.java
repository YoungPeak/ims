package business.repo;

import business.bean.UserBean;
import constants.CollectionNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class UserRepository extends RepositoryAdaptor<UserBean> {
	@Autowired
	private MongoTemplate mongoTemplate;

	private static final String COLLECTION = CollectionNames.USER;
	/**
	 * 通过用户名查找用户
	 * @param username 用户名
	 * @return
	 */
	public UserBean findByName(String username) {
		return mongoTemplate.findOne(
				new Query(new Criteria("name").is(username)),
				UserBean.class, COLLECTION);
	}
	/**
	 * 添加一个用户
	 * @param user
	 */
	@Override
	public void insert(UserBean user) {
		mongoTemplate.insert(user, COLLECTION);
	}
}
