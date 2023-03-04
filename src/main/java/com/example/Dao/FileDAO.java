package com.example.Dao;

import com.example.Dto.FileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface FileDAO {

    public int insertFile(List<FileDTO> fileList);

    public FileDTO selectFileDetail(Long idx);

    public int deleteFile(Long boardIdx);

    public List<FileDTO> selectFileList(Long boardIdx);

    public int selectFileTotalCount(Long boardIdx);
}
