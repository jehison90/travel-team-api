package com.team.travel.travelteam.api.data.service;

import com.team.travel.travelteam.api.data.entities.Position;
import com.team.travel.travelteam.api.data.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jehison on 11/05/2016.
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;

    @Override
    public List<Position> getActivePositionsByRoute(Integer routeId) {
        return positionRepository.getActivePositionsByRoute(routeId);
    }
}
