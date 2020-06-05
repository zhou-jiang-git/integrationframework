package com.zhoujiang.integrationframework.dao;

import com.zhoujiang.integrationframework.domain.goods;
import com.zhoujiang.integrationframework.domain.goodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface goodsMapper {
    long countByExample(goodsExample example);

    int deleteByExample(goodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(goods record);

    int insertSelective(goods record);

    List<goods> selectByExample(goodsExample example);

    goods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") goods record, @Param("example") goodsExample example);

    int updateByExample(@Param("record") goods record, @Param("example") goodsExample example);

    int updateByPrimaryKeySelective(goods record);

    int updateByPrimaryKey(goods record);
}