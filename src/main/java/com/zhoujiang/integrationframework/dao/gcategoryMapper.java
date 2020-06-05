package com.zhoujiang.integrationframework.dao;

import com.zhoujiang.integrationframework.domain.gcategory;
import com.zhoujiang.integrationframework.domain.gcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface gcategoryMapper {
    long countByExample(gcategoryExample example);

    int deleteByExample(gcategoryExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(gcategory record);

    int insertSelective(gcategory record);

    List<gcategory> selectByExample(gcategoryExample example);

    gcategory selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") gcategory record, @Param("example") gcategoryExample example);

    int updateByExample(@Param("record") gcategory record, @Param("example") gcategoryExample example);

    int updateByPrimaryKeySelective(gcategory record);

    int updateByPrimaryKey(gcategory record);
}