package com.example.Dao;

import com.example.Dto.CommunityDTO;
import com.example.Dto.CommunityTwoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityDAO {

    public List<CommunityDTO> listCommunity(CommunityDTO communityDTO) throws Exception;

    public void uploadboard(CommunityDTO communityDTO) throws Exception;

    public void fileUploadboard(CommunityDTO communityDTO) throws Exception;

    public CommunityDTO readBoard(CommunityDTO communityDTO) throws Exception;

    public void insertBoard(CommunityTwoDTO communityTwoDTO) throws Exception;

}
