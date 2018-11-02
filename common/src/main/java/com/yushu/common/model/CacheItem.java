package com.yushu.common.model;

import java.util.Date;

public class CacheItem {
    public Date expireDate;
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    public Date getExpireDate() {
        return expireDate;
    }

    private Object data;
    public void setData(Object data) {
        this.data = data;
    }
    public Object getData() {
        return data;
    }
}
