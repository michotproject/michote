package com.michote.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michote.responseObjects.HouseResponse;

/**
 * Created by jtq603 on 10/23/16.
 */
@Service
public interface HouseServiceInterface {

    public String create(HouseResponse houseResponse);
    
    public List<HouseResponse> viewHouseByZip(int zip);

}
