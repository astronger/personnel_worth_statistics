package com.haort.bean;

import lombok.Data;

@Data
public class Counts {
    private String id;
    private int succesCounts;
    private int failCounts;
    private String startTime;
    private String endTime;
    private String createTime;
}
