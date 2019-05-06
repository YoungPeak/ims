package business.service;

import business.bean.UserBean;
import business.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserBean findUserByName(String name) {
        return userRepository.findByName(name);
    }
}
