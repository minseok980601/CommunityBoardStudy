package com.example.Controller;

import com.example.Dao.MemberDAO;
import com.example.Dto.MemberDTO;
import com.example.Service.MemberService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@MapperScan(basePackages = "com.example.dao")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping(value = "/loginpage")
    public String loginPage() throws Exception {
        return "loginpage";
    }

    @PostMapping(value = "/loginMember")
    public String loginMember(String id, String pwd, HttpSession session) throws Exception {

        MemberDTO member = memberService.loginMember(id, pwd, session);
        session.setAttribute("loginMember", member);

        return "redirect:community";

    }
}
