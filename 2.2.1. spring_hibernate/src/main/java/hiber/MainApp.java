package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user1 = new User("Anton1", "Shorin1", "Ant1@gmail.com");
        User user2 = new User("Anton2", "Shorin2", "Ant2@gmail.com");
        User user3 = new User("Anton3", "Shorin3", "Ant3@gmail.com");

        user1.setCar(new Car("Kia", 1));
        user2.setCar(new Car("Nissan", 2));
        user3.setCar(new Car("Haval", 3));

        userService.add(user1);
        userService.add(user2);
        userService.add(user3);

        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }

        User user4 = userService.carList(new Car("Audi",6));
        System.out.println(user4);
        User user5 = userService.carList(new Car("Reno", 6));
        System.out.println(user5);
        context.close();
    }
}
