package com.citybrain.agenthub.controller;

import com.citybrain.agenthub.model.GridInfo;
import com.citybrain.agenthub.service.GridInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GridInfoController {

    @Autowired
    GridInfoService gridInfoService;

    @Autowired
    GridInfo gridInfo;

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public int save(GridInfo gridInfo) {
        gridInfo.setZoneLng("asdf");
        gridInfo.setZoneName("asd");
        gridInfo.setZoneId("222");
        gridInfo.setCntUser("asdf");
        gridInfo.setZoneLat("asfs");
        return gridInfoService.action(gridInfo);
    }
}
