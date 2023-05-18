package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
    @Transactional
    void add(User user);
    @Transactional(readOnly = true)
    List<User> listUsers();
    User carList(Car car);
}