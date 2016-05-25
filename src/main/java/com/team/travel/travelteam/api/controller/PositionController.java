package com.team.travel.travelteam.api.controller;

import com.team.travel.travelteam.api.data.entities.Position;
import com.team.travel.travelteam.api.data.entities.Route;
import com.team.travel.travelteam.api.data.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Jehison on 11/05/2016.
 */
@RestController
@RequestMapping("position")
public class PositionController {

    @Autowired
    PositionService positionService;

    @RequestMapping(value = "{routeId}")
    public List<Position> getActivePositionsByRoute(@PathVariable("routeId") Integer routeId){
        return positionService.getActivePositionsByRoute(routeId);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Position createPosition(@RequestBody Position position) {
        return positionService.save(position);
    }

    @RequestMapping(value = "/user/{userName}")
    public Route getUserActiveRoute(@PathVariable("userName") String userName){
        return positionService.getUserActiveRoute(userName);
    }

}
