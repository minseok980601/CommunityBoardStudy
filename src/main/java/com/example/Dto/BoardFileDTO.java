package com.example.Dto;

import lombok.Data;

@Data
public class BoardFileDTO {

    private int idx;
    private int boardIdx;
    private String originalFileName;
    private String storedFilePath;
    private long filesize;
}
