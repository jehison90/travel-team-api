package com.team.travel.travelteam.api.data.repository;

import com.team.travel.travelteam.api.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jehison on 09/05/2016.
 */
public interface RouteRepository extends JpaRepository<User, String> {

}
