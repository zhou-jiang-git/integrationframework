package com.zhoujiang.integrationframework.dao;

import com.zhoujiang.integrationframework.domain.guser;
import com.zhoujiang.integrationframework.domain.guserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface guserMapper {
    long countByExample(guserExample example);

    int deleteByExample(guserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(guser record);

    int insertSelective(guser record);

    List<guser> selectByExample(guserExample example);

    guser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") guser record, @Param("example") guserExample example);

    int updateByExample(@Param("record") guser record, @Param("example") guserExample example);

    int updateByPrimaryKeySelective(guser record);

    int updateByPrimaryKey(guser record);
}