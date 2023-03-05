package com.example.Dao;

import com.example.Dto.BoardFileDTO;
import com.example.Dto.CommunityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Mapper
public interface CommunityDAO {

    public List<CommunityDTO> listCommunity(CommunityDTO communityDTO) throws Exception;

    // public void uploadboard(CommunityDTO communityDTO) throws Exception;

    public void uploadboard(CommunityDTO communityDTO) throws Exception;

    public void fileUploadboard(CommunityDTO communityDTO) throws Exception;

    public void insertBoardFileList(List<BoardFileDTO> list) throws Exception;

    public CommunityDTO readBoard(CommunityDTO communityDTO) throws Exception;

}
