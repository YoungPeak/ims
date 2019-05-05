package business.repo;

import java.util.List;


public interface AbstractRespository<T> {
	
	public void insert(T obj);
	
	public T findOne(String id);
	
	public List<T> findAll();
	
	public List<T> findByRegex(String regex);
	
	public void removeOne(String id);
	
	public void removeAll();
	
	public void findAndModify(String id);
}
