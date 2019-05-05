package test.mongodb.repo;

import test.mongodb.bean.Person;

import java.util.List;

public interface AbstractRespository {
	
	public void insert(Person person);
	
	public Person findOne(String id);
	
	public List<Person> findAll();
	
	public List<Person> findByRegex(String regex);
	
	public void removeOne(String id);
	
	public void removeAll();
	
	public void findAndModify(String id);
}
