package com.daiqi.generator.mapper;

import com.daiqi.generator.entity.Test;
import com.daiqi.generator.entity.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* Author: Created by DaiQi
* Date: Created in 2019/05/14 18:13
* Description：say something about your class
*/
@Repository
public interface TestMapper {
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);
}