package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    void save();

    List<User> getUsers();

    User getById(int id);

    void delete(int id);
}
