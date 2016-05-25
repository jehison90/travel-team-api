package com.team.travel.travelteam.api.data.service;

import com.team.travel.travelteam.api.data.entities.Position;
import com.team.travel.travelteam.api.data.entities.Route;
import com.team.travel.travelteam.api.data.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Jehison on 11/05/2016.
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;

    @Override
    @Transactional
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public List<Position> getActivePositionsByRoute(Integer routeId) {
        return positionRepository.getActivePositionsByRoute(routeId);
    }

    @Override
    public Route getUserActiveRoute (String userName){
        return positionRepository.getUserActiveRoute(userName);
    }
}
