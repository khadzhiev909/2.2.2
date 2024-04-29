package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public String add(@RequestParam("name") String name,
                      @RequestParam("surname") String surname,
                      @RequestParam("sex") String sex,
                      Model model) {


        return "user";
    }

    @GetMapping("/")
    public String getUser(@RequestParam("id") int id, Model model) {

        return "user";
    }

    @GetMapping("/getAll")
    public String getAllUsers(Model model) {

        return "user";
    }

    public String updateUser(Model model) {

        return "user";
    }

    public String deleteUser(@RequestParam("id") int id, Model model) {

        return "user";
    }
}
