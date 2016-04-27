package com.team.travel.travelteam.api.data.service;

import com.team.travel.travelteam.api.data.entities.User;
import com.team.travel.travelteam.api.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Jehison on 25/04/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public User find(String userName){
        return userRepository.findOne(userName);
    }

}
