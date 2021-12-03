package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Oleh", "Senych", (byte) 21);
        userService.saveUser("Bogdan", "Makovskiy", (byte) 16);
        userService.saveUser("Maksim", "Filippov", (byte) 26);
        userService.saveUser("Roman", "Melnikov", (byte) 20);
        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}