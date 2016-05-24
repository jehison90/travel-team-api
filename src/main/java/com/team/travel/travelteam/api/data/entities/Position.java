package com.team.travel.travelteam.api.data.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.team.travel.travelteam.api.data.utility.DateUtility;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jehison on 10/05/2016.
 */
@Entity
@Table(name = "position", schema = "public")
public class Position implements Serializable {

    @EmbeddedId
    private PositionPk positionPk;

    @Column(name = "last_x")
    private double lastX;

    @Column(name = "last_y")
    private double lastY;

    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = DateUtility.DEFAULT_DATE_PATTERN)
    private Date lastUpdated;

    @Column(name = "is_active")
    private boolean active;

    @Column(name = "is_ok")
    private boolean normalPosition;

    @MapsId("routeId")
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @MapsId("userName")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_name")
    private User user;

    public PositionPk getPositionPk() {
        return positionPk;
    }

    public void setPositionPk(PositionPk positionPk) {
        this.positionPk = positionPk;
    }

    public double getLastX() {
        return lastX;
    }

    public void setLastX(double lastX) {
        this.lastX = lastX;
    }

    public double getLastY() {
        return lastY;
    }

    public void setLastY(double lastY) {
        this.lastY = lastY;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isNormalPosition() {
        return normalPosition;
    }

    public void setNormalPosition(boolean normalPosition) {
        this.normalPosition = normalPosition;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
