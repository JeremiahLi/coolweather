package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lijian on 2017/11/29.
 */

public class County extends DataSupport {
    private int id;
    private int cityId;
    private String countyName;
    private String weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }
}
