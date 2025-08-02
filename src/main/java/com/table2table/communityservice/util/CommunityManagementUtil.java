package com.table2table.communityservice.util;


import com.table2table.communityservice.dto.CommunityDto;
import com.table2table.communityservice.dto.CreateCommunityRequest;
import com.table2table.communityservice.entity.Community;

import java.time.LocalDateTime;


public class CommunityManagementUtil {
    public static CommunityDto toDto(Community c) {
        CommunityDto dto = new CommunityDto();
        dto.setId(c.getCommunityId());
        dto.setName(c.getName());
        dto.setLocation(c.getLocation());
        dto.setTotalFlats(c.getTotalFlats());
        dto.setPinCode(c.getPinCode());
        dto.setCreatedOn(c.getCreatedOn());
        dto.setLastUpdatedOn(c.getLastUpdatedOn());
        return dto;
    }

    public static Community toEntity(CreateCommunityRequest request) {
        Community c = new Community();
        c.setName(request.getName());
        c.setLocation(request.getLocation());
        c.setTotalFlats(request.getTotalFlats());
        c.setPinCode(request.getPinCode());
        c.setCreatedOn(LocalDateTime.now());
        c.setLastUpdatedOn(LocalDateTime.now());
        return c;
    }
}
