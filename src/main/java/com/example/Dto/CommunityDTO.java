package com.example.Dto;

import lombok.Data;

import java.sql.Date;

@Data
public class CommunityDTO {
    private int post_num;
    private String post_title;
    private String post_id;
    private String post_content;
    private int post_hits;
    private int post_good;
    private int post_bad;
    private Date post_date;
}
