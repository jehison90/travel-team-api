package com.team.travel.travelteam.api.data.repository;

import com.team.travel.travelteam.api.data.entities.Position;
import com.team.travel.travelteam.api.data.entities.PositionPk;
import com.team.travel.travelteam.api.data.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Jehison on 11/05/2016.
 */
public interface PositionRepository extends JpaRepository<Position, PositionPk>{

    @Query("SELECT p FROM Position p WHERE p.route.id = :routeId AND p.active = true")
    List<Position> getActivePositionsByRoute(@Param("routeId") Integer routeId);

    @Query("SELECT p.route FROM Position p WHERE p.user.user = :userName AND p.active = true")
    Route getUserActiveRoute (@Param("userName") String userName);

}
