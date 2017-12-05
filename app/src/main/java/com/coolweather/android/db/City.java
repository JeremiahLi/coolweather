package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lijian on 2017/11/29.
 */

public class City extends DataSupport {
    private int id;
    private int cityId;
    private String cityName;
    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
