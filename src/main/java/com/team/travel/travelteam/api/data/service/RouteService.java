package com.team.travel.travelteam.api.data.service;

import com.team.travel.travelteam.api.data.entities.Route;

/**
 * Created by Jehison on 22/05/2016.
 */
public interface RouteService {

    Route save(Route route);

    Route find(Integer routeId);

}
