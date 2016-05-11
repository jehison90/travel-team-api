package com.team.travel.travelteam.api.data.service;

import com.team.travel.travelteam.api.data.entities.Position;

import java.util.List;

/**
 * Created by Jehison on 11/05/2016.
 */
public interface PositionService {

    List<Position> getActivePositionsByRoute(Integer routeId);

}
