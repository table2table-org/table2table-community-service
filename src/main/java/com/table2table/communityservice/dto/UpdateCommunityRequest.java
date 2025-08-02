package com.table2table.communityservice.dto;

import lombok.Data;

@Data
public class UpdateCommunityRequest {
    private String name;
    private String location;
    private Integer totalFlats;
    private Long pinCode;
}
