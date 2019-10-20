package com.fan.cap8.dao;

import org.springframework.stereotype.Repository;

/**
 * @author fan
 * @create 2019-10-20 21:07
 * @description
 * @see
 */
@Repository
public class TestDao {

    private String flag = "1";

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TestDao{" +
                "flag='" + flag + '\'' +
                '}';
    }

    public String getFlag() {
        return flag;
    }


}
