package com.example.Dao;

import com.example.Dto.CommunityDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityDAO {

    public List<CommunityDTO> listCommunity(CommunityDTO communityDTO) throws Exception;

    public void uploadboard(CommunityDTO communityDTO) throws Exception;

    public List<CommunityDTO> readBoard(int post_num) throws Exception;

}
