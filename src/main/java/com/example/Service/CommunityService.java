package com.example.Service;

import com.example.Dao.CommunityDAO;
import com.example.Dto.CommunityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("communityService")
public class CommunityService {

    @Autowired
    CommunityDAO communityDAO;

    public List<CommunityDTO> listCommunity(CommunityDTO communityDTO) throws Exception {
        return communityDAO.listCommunity(communityDTO);
    }

    public void uploadBoard(CommunityDTO communityDTO) throws Exception {
        communityDAO.uploadboard(communityDTO);
    }

    public CommunityDTO readBoard(CommunityDTO communityDTO) throws Exception {
        return communityDAO.readBoard(communityDTO);
    }
}
