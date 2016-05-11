package com.team.travel.travelteam.api.data.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Jehison on 10/05/2016.
 */
@Embeddable
public class PositionPk implements Serializable{

    @Column(name = "route_id")
    private Integer routeId;

    @Column(name = "user_name")
    private String userName;

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionPk that = (PositionPk) o;

        if (routeId != null ? !routeId.equals(that.routeId) : that.routeId != null) return false;
        return userName != null ? userName.equals(that.userName) : that.userName == null;

    }

    @Override
    public int hashCode() {
        int result = routeId != null ? routeId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
