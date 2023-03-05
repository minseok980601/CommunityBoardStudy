package com.example.Dao;

import com.example.Dto.BoardFileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface FileDAO {

    public int insertFile(List<BoardFileDTO> fileList);

    public BoardFileDTO selectFileDetail(Long idx);

    public int deleteFile(Long boardIdx);

    public List<BoardFileDTO> selectFileList(Long boardIdx);

    public int selectFileTotalCount(Long boardIdx);
}
