package com.example.Controller;

import com.example.Dao.CommunityDAO;
import com.example.Dto.CommunityDTO;
import com.example.Dto.CommunityTwoDTO;
import com.example.Dto.TestDTO;
import com.example.Service.CommunityService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

@Controller
@MapperScan(basePackages = "com.example.dao")
public class CommunityController {

    @Autowired
    CommunityDAO communityDAO;

    @Autowired
    CommunityService communityService;

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
    public String successUploadBoard(CommunityDTO communityDTO, MultipartFile file) throws Exception {
        communityService.uploadBoard(communityDTO, file);

        return "redirect:community";
    }

    @GetMapping(value ="/fileuploadboard")
    public String fileUploadboard() throws Exception {
        return "fileuploadboardpage";
    }

    @PostMapping(value = "/successuploadboard2")
    public String successUploadBoard2(CommunityTwoDTO communityTwoDTO) throws Exception {
        communityService.insertBoard(communityTwoDTO);

        return "redirect:community";
    }

    @GetMapping(value = "/readboard")
    public String readBoard(@ModelAttribute("readBoard") CommunityDTO communityDTO, Model model, int post_num) throws Exception {
        CommunityDTO readBoard = communityDAO.readBoard(communityDTO);
        model.addAttribute("readBoard", readBoard);

        return "readboard";
    }


}
