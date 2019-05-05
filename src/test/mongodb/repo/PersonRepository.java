package test.mongodb.repo;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import test.mongodb.bean.Person;

import java.util.List;

public class PersonRepository implements AbstractRespository {

	private MongoTemplate mongoTemplate;
	
	
	@Override
	public void insert(Person person) {
		

	}

	@Override
	public Person findOne(String id) {
		
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), Person.class);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByRegex(String regex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeOne(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void findAndModify(String id) {
		// TODO Auto-generated method stub

	}

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	public Person findByName(String name,String collectionName){
		return mongoTemplate.findOne(new Query(Criteria.where("name").is(name)), Person.class, collectionName);
	}
	
}
