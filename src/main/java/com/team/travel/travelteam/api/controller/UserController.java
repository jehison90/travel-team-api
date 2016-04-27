package com.team.travel.travelteam.api.controller;
import com.team.travel.travelteam.api.data.entities.User;
import com.team.travel.travelteam.api.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "{userName}")
    public User getUser(@PathVariable("userName") String userName) {
        return userService.find(userName);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }
}
