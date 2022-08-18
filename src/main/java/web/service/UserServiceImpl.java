package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

   private final UserDao userDao;

   @Autowired
   public UserServiceImpl(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   @Transactional
   public void addUser(User user) {
      userDao.addUser(user);
   }

   @Override
   @Transactional
   public void removeUserById(long id) {
      userDao.removeUserById(id);
   }

   @Override
   @Transactional(readOnly = true)
   public List<User> getAllUsers() {
      return userDao.getAllUsers();
   }

   @Override
   @Transactional(readOnly = true)
   public User getUserById(long id) {
     return userDao.getUserById(id);
   }

   @Override
   @Transactional
   public void updateUser(User user) {
      userDao.updateUser(user);
   }
}
