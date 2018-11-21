package com.citybrain.agenthub.service.serviceImpl;

import com.citybrain.agenthub.mapper.GridInfoMapper;
import com.citybrain.agenthub.model.GridInfo;
import com.citybrain.agenthub.service.GridInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GridInfoServiceImpl implements GridInfoService {

    @Autowired
    GridInfoMapper gridInfoMapper;


    @Override
    public int action(GridInfo gridInfo) {
        return gridInfoMapper.insert(gridInfo);
    }
}
