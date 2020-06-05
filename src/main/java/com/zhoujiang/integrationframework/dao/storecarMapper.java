package com.zhoujiang.integrationframework.dao;

import com.zhoujiang.integrationframework.domain.storecar;
import com.zhoujiang.integrationframework.domain.storecarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface storecarMapper {
    long countByExample(storecarExample example);

    int deleteByExample(storecarExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(storecar record);

    int insertSelective(storecar record);

    List<storecar> selectByExample(storecarExample example);

    storecar selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") storecar record, @Param("example") storecarExample example);

    int updateByExample(@Param("record") storecar record, @Param("example") storecarExample example);

    int updateByPrimaryKeySelective(storecar record);

    int updateByPrimaryKey(storecar record);
}