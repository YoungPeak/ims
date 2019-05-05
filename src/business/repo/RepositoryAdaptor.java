package business.repo;

import java.util.List;

public abstract class RepositoryAdaptor<T> implements AbstractRespository<T>{

	@Override
	public void insert(T obj) {

	}

	@Override
	public T findOne(String id) {
		return null;
	}

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public List<T> findByRegex(String regex) {
		return null;
	}

	@Override
	public void removeOne(String id) {

	}

	@Override
	public void removeAll() {

	}

	@Override
	public void findAndModify(String id) {

	}

}
