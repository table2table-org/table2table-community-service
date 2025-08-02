package com.table2table.communityservice.dto;

import lombok.Data;

@Data
public class CreateCommunityRequest {
    private String name;
    private String location;
    private Integer totalFlats;
    private Long pinCode;
}
