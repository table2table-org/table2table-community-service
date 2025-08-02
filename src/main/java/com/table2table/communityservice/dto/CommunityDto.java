package com.table2table.communityservice.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommunityDto {
    private Long id;
    private String name;
    private String location;
    private Integer totalFlats;
    private Long pinCode;
    private LocalDateTime createdOn;
    private LocalDateTime lastUpdatedOn;
}

