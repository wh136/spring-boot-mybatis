package com.citybrain.agenthub.mapper;

import com.citybrain.agenthub.model.GridInfo;
import com.citybrain.agenthub.model.GridInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GridInfoMapper {
    int countByExample(GridInfoCriteria example);

    int deleteByExample(GridInfoCriteria example);

    int deleteByPrimaryKey(String zoneId);

    int insert(GridInfo record);

    int insertSelective(GridInfo record);

    List<GridInfo> selectByExample(GridInfoCriteria example);

    GridInfo selectByPrimaryKey(String zoneId);

    int updateByExampleSelective(@Param("record") GridInfo record, @Param("example") GridInfoCriteria example);

    int updateByExample(@Param("record") GridInfo record, @Param("example") GridInfoCriteria example);

    int updateByPrimaryKeySelective(GridInfo record);

    int updateByPrimaryKey(GridInfo record);
}