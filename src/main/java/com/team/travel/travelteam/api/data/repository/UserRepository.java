package com.team.travel.travelteam.api.data.repository;

import com.team.travel.travelteam.api.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Jehison on 25/04/2016.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
