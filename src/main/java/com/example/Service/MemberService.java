package com.example.Service;

import com.example.Dao.MemberDAO;
import com.example.Dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberService {

    @Autowired
    MemberDAO memberDAO;

    public MemberDTO loginMember(String id, String pwd) throws Exception {
        return memberDAO.loginMember(id, pwd);
    }
}
