package com.example.Dto;

import lombok.Data;

@Data
public class FileDTO {

    private Long idx;
    private Long boardIdx;
    private String originalName;
    private String saveName;
    private long size;
}
