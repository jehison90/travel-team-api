package com.team.travel.travelteam.api.data.service;

import com.team.travel.travelteam.api.data.entities.Route;
import com.team.travel.travelteam.api.data.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Jehison on 22/05/2016.
 */
@Service
public class RouteServiceImpl implements RouteService{

    @Autowired
    private RouteRepository routeRepository;

    @Override
    @Transactional
    public Route save(Route route) {
        return routeRepository.save(route);
    }

    @Override
    @Transactional
    public Route find(Integer routeId){
        return routeRepository.findOne(routeId);
    }

}
