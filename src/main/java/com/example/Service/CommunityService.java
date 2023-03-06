package com.example.Service;

import com.example.Dao.CommunityDAO;
import com.example.Dto.CommunityDTO;
import com.example.Dto.CommunityTwoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("communityService")
public class CommunityService {

    @Autowired
    CommunityDAO communityDAO;

//    @Autowired
//    FileUtils fileUtils;

    public List<CommunityDTO> listCommunity(CommunityDTO communityDTO) throws Exception {
        return communityDAO.listCommunity(communityDTO);
    }

    public void uploadBoard(CommunityDTO communityDTO) throws Exception {
        communityDAO.uploadboard(communityDTO);
    }

/*    public void fileUploadBoard(CommunityDTO communityDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {
        communityDAO.fileUploadboard(communityDTO);
        List<BoardFileDTO> list = fileUtils.parseFileInfo(communityDTO.getPost_num(), multipartHttpServletRequest);
        if (CollectionUtils.isEmpty(list) == false) {
            communityDAO.insertBoardFileList(list);
        }
    }*/

    public CommunityDTO readBoard(CommunityDTO communityDTO) throws Exception {
        return communityDAO.readBoard(communityDTO);
    }

    public void insertBoard(CommunityTwoDTO communityTwoDTO) throws Exception {
         communityDAO.insertBoard(communityTwoDTO);
    }
}
