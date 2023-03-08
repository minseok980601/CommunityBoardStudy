package com.example.Dao;

import com.example.Dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDAO {

    public void testUpLoad(TestDTO testDTO) throws Exception;
}
