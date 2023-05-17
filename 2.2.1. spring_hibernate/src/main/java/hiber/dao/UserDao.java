package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
    @Transactional
    void add(User user);

    @Transactional
    List<User> listUsers();

    User carList(Car car);
}