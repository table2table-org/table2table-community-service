package com.table2table.communityservice.service;



import com.table2table.communityservice.dto.CommunityDto;
import com.table2table.communityservice.dto.CreateCommunityRequest;
import com.table2table.communityservice.dto.UpdateCommunityRequest;

import java.util.List;

public interface CommunityService {
    CommunityDto createCommunity(CreateCommunityRequest request);
    List<CommunityDto> getAllCommunities();
    CommunityDto getCommunityById(Long id);
    CommunityDto updateCommunity(Long id, UpdateCommunityRequest request);
    void deleteCommunity(Long id);
}