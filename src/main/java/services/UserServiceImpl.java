package services;

import dao.UserDaoImpl;
import model.Auto;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDaoImpl usersDao = new UserDaoImpl();

    public UserServiceImpl() {
    }

    @Override
    public User findUser(int id) {
        return usersDao.findById(id);
    }

    @Override
    public void saveUser(User user) {
        usersDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    @Override
    public void updateUser(User user) {
        usersDao.update(user);
    }

    @Override
    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    @Override
    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }
}
