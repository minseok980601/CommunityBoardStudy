package com.example.Controller;

import com.example.Dao.CommunityDAO;
import com.example.Dto.CommunityDTO;
import com.example.Service.CommunityService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@MapperScan(basePackages = "com.example.dao")
public class CommunityController {

    @Autowired
    CommunityDAO communityDAO;

    @GetMapping(value = "/community")
    public String community(Model model, CommunityDTO communityDTO) throws Exception {

        List<CommunityDTO> communityList = communityDAO.listCommunity(communityDTO);
        model.addAttribute("communityList", communityList);

        return "communitypage";
    }

    @GetMapping(value ="/uploadboard")
    public String uploadboard() throws Exception {
        return "uploadboardpage";
    }

    @PostMapping(value = "/successuploadboard")
    public String successUploadBoard(CommunityDTO communityDTO) throws Exception {
        communityDAO.uploadboard(communityDTO);

        return "redirect:community";
    }

    @GetMapping(value = "/readboard")
    public String readBoard(Model model, int post_num) throws Exception {
        List<CommunityDTO> readBoard = communityDAO.readBoard(post_num);
        model.addAttribute("readBoard", readBoard);

        return "readboard";
    }
}
