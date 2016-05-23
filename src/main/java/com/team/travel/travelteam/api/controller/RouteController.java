package com.team.travel.travelteam.api.controller;

import com.team.travel.travelteam.api.data.entities.Route;
import com.team.travel.travelteam.api.data.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jehison on 22/05/2016.
 */
@RestController
@RequestMapping("route")
public class RouteController {

    @Autowired
    RouteService routeService;

    @RequestMapping(value = "{routeId}")
    public Route getUser(@PathVariable("routeId") Integer routeId) {
        return routeService.find(routeId);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Route createRoute(@RequestBody Route route) {
        return routeService.save(route);
    }

}
