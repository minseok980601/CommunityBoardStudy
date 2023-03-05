package com.example.Dto;

import lombok.Data;

import java.sql.Date;

@Data
public class CommunityTwoDTO {
    private int board_idx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private String createdDatetime;
    private String updaterId;
    private String updatedDatetime;
}
