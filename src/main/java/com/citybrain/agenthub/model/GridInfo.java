package com.citybrain.agenthub.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class GridInfo implements Serializable {
    private String zoneId;

    private String zoneName;

    private String zoneLng;

    private String zoneLat;

    private String cntUser;

    private static final long serialVersionUID = 1L;

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId == null ? null : zoneId.trim();
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getZoneLng() {
        return zoneLng;
    }

    public void setZoneLng(String zoneLng) {
        this.zoneLng = zoneLng == null ? null : zoneLng.trim();
    }

    public String getZoneLat() {
        return zoneLat;
    }

    public void setZoneLat(String zoneLat) {
        this.zoneLat = zoneLat == null ? null : zoneLat.trim();
    }

    public String getCntUser() {
        return cntUser;
    }

    public void setCntUser(String cntUser) {
        this.cntUser = cntUser == null ? null : cntUser.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GridInfo other = (GridInfo) that;
        return (this.getZoneId() == null ? other.getZoneId() == null : this.getZoneId().equals(other.getZoneId()))
            && (this.getZoneName() == null ? other.getZoneName() == null : this.getZoneName().equals(other.getZoneName()))
            && (this.getZoneLng() == null ? other.getZoneLng() == null : this.getZoneLng().equals(other.getZoneLng()))
            && (this.getZoneLat() == null ? other.getZoneLat() == null : this.getZoneLat().equals(other.getZoneLat()))
            && (this.getCntUser() == null ? other.getCntUser() == null : this.getCntUser().equals(other.getCntUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZoneId() == null) ? 0 : getZoneId().hashCode());
        result = prime * result + ((getZoneName() == null) ? 0 : getZoneName().hashCode());
        result = prime * result + ((getZoneLng() == null) ? 0 : getZoneLng().hashCode());
        result = prime * result + ((getZoneLat() == null) ? 0 : getZoneLat().hashCode());
        result = prime * result + ((getCntUser() == null) ? 0 : getCntUser().hashCode());
        return result;
    }
}