package com.example.Service;

import com.example.Common.FileUtils;
import com.example.Dao.CommunityDAO;
import com.example.Dto.BoardFileDTO;
import com.example.Dto.CommunityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Service("communityService")
public class CommunityService {

    @Autowired
    CommunityDAO communityDAO;

    @Autowired
    FileUtils fileUtils;

    public List<CommunityDTO> listCommunity(CommunityDTO communityDTO) throws Exception {
        return communityDAO.listCommunity(communityDTO);
    }

    public void uploadBoard(CommunityDTO communityDTO) throws Exception {
        communityDAO.uploadboard(communityDTO);
    }

    public void fileUploadBoard(CommunityDTO communityDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {
        communityDAO.fileUploadboard(communityDTO);
        List<BoardFileDTO> list = fileUtils.parseFileInfo(communityDTO.getPost_num(), multipartHttpServletRequest);
        if (CollectionUtils.isEmpty(list) == false) {
            communityDAO.insertBoardFileList(list);
        }
    }

    public CommunityDTO readBoard(CommunityDTO communityDTO) throws Exception {
        return communityDAO.readBoard(communityDTO);
    }
}
