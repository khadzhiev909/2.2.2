package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save() {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
