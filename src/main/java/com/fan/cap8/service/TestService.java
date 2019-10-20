package com.fan.cap8.service;

import com.fan.cap8.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author fan
 * @create 2019-10-20 21:07
 * @description
 * @see
 */
@Service
public class TestService {
    @Qualifier("testDao2")
    @Autowired
    private TestDao testDao;

    public void plintln(){
        System.out.println(testDao);
    }
}
