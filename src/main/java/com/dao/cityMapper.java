package com.dao;

import com.model.city;

public interface cityMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(city record);


    int insertSelective(city record);

    city selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(city record);

    int updateByPrimaryKey(city record);
}