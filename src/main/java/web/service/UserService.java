package web.service;


import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

}
