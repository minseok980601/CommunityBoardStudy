package com.example.Dao;

import com.example.Dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpSession;

@Mapper
public interface MemberDAO {

    public MemberDTO loginMember(String id, String pwd, HttpSession session) throws Exception;
}
