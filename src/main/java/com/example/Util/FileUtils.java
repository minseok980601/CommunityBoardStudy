package com.example.Util;

import com.example.Dto.FileDTO;
import com.example.Exception.AttachFileException;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class FileUtils {

    private final String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd"));

    private final String uploadPath = Paths.get("C:", "develop", "upload", today).toString();

    private final String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public List<FileDTO> uploadFiles(MultipartFile[] files, Long boardIdx) {
        if (files[0].getSize() < 1) {
            return Collections.emptyList();
        }

        List<FileDTO> fileList = new ArrayList<>();

        File dir = new File(uploadPath);
        if (dir.exists() == false) {
            dir.mkdirs();
        }

        for (MultipartFile file : files) {
            try {
                final String extension = FilenameUtils.getExtension(file.getOriginalFilename());
                final String saveName = getRandomString() + "." + extension;

                File target = new File(uploadPath, saveName);
                file.transferTo(target);

                FileDTO fileDTO = new FileDTO();
                fileDTO.setBoardIdx(boardIdx);
                fileDTO.setOriginalName(file.getOriginalFilename());
                fileDTO.setSaveName(saveName);
                fileDTO.setSize(file.getSize());

                fileList.add(fileDTO);
            } catch (IOException e) {
                throw new AttachFileException("[" + file.getOriginalFilename() + "] failed to save file...");
            } catch (Exception e) {
                throw new AttachFileException("[" + file.getOriginalFilename() + "] failed to save file...");
            }
        }

        return fileList;
    }
}
