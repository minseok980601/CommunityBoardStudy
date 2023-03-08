package com.example.Controller;

import com.example.Dao.TestDAO;
import com.example.Dto.CommunityDTO;
import com.example.Dto.TestDTO;
import com.example.Service.TestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@MapperScan(basePackages = "com.example.dao")
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    TestDAO testDAO;

    @GetMapping(value = "/test")
    public String test(CommunityDTO communityDTO) throws Exception {
        return "testuploadboardpage";
    }

    @PostMapping(value ="/testupload")
    public String testupload(TestDTO testDTO, MultipartFile file) throws Exception {
//        testService.testUpLoad(testDTO, file);

        testDAO.testUpLoad(testDTO);

        return "redirect:community";
    }
}
