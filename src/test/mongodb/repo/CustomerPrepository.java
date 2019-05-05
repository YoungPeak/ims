package test.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import test.mongodb.bean.Customer;

import java.util.List;


public interface CustomerPrepository extends MongoRepository<Customer, String> {

	public Customer findByName(String name);
    public List<Customer> findByAge(int age);
}
