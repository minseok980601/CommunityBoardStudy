package com.example.Service;

import com.example.Dao.TestDAO;
import com.example.Dto.CommunityDTO;
import com.example.Dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Service("testService")
public class TestService {

    @Autowired
    TestDAO testDAO;

    public void testUpLoad(TestDTO testDTO, MultipartFile file) throws Exception {
/*

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
        testDTO.setFilename(fileName);
        // 저장된 파일의 이름, 저장된 파일의 경로
        testDTO.setFilepath("/files/" + fileName);

*/
        testDAO.testUpLoad(testDTO);
    }
}
