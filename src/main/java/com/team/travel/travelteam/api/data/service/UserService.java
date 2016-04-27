package com.team.travel.travelteam.api.data.service;

import com.team.travel.travelteam.api.data.entities.User;

/**
 * Created by Jehison on 25/04/2016.
 */
public interface UserService {

    User save(User user);

    User find(String userName);

}
