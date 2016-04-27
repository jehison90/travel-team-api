package com.team.travel.travelteam.api.data.repository;

import com.team.travel.travelteam.api.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jehison on 25/04/2016.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
