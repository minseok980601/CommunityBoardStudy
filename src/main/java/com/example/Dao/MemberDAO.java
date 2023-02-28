package com.example.Dao;

import com.example.Dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {

    public MemberDTO loginMember(String id, String pwd) throws Exception;
}
