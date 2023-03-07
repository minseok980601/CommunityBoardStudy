package com.example.Service;

import com.example.Dao.CommunityDAO;
import com.example.Dto.CommunityDTO;
import com.example.Dto.CommunityTwoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Service("communityService")
public class CommunityService {

    @Autowired
    CommunityDAO communityDAO;

//    @Autowired
//    FileUtils fileUtils;

    public List<CommunityDTO> listCommunity(CommunityDTO communityDTO) throws Exception {
        return communityDAO.listCommunity(communityDTO);
    }

    public void uploadBoard(CommunityDTO communityDTO, MultipartFile file) throws Exception {

        // 지정할 경로를 지정
        String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\files";

        // 식별자, 랜덤으로 이름을 만들어줌
        UUID uuid = UUID.randomUUID();

        // 랜덤식별자_원래파일이름 = 저장된 파일이름 지정
        String fileName = uuid + "_" + file.getOriginalFilename();

        // 빈 껍데기 생성 - File을 생성할건데, 이름은 "name"으로 할거고, projectPath 라는 경로에 담긴다는 뜻
        File saveFile = new File(projectPath, fileName);

        file.transferTo(saveFile);

        // 디비에 파일 넣기
        communityDTO.setFilename(fileName);
        // 저장된 파일의 이름, 저장된 파일의 경로
        communityDTO.setFilepath("/files/" + fileName);

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
