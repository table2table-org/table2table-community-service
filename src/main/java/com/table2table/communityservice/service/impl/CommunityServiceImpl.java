package com.table2table.communityservice.service.impl;


import com.table2table.communityservice.dto.CommunityDto;
import com.table2table.communityservice.dto.CreateCommunityRequest;
import com.table2table.communityservice.dto.UpdateCommunityRequest;
import com.table2table.communityservice.entity.Community;
import com.table2table.communityservice.repository.CommunityRepository;
import com.table2table.communityservice.service.CommunityService;
import com.table2table.communityservice.util.CommunityManagementUtil;
import com.table2table.security.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommunityServiceImpl implements CommunityService {

    private final CommunityRepository communityRepository;

    @Override
    public CommunityDto createCommunity(CreateCommunityRequest request) {
        Community community = CommunityManagementUtil.toEntity(request);
        Community saved = communityRepository.save(community);
        return CommunityManagementUtil.toDto(saved);
    }

    @Override
    public List<CommunityDto> getAllCommunities() {
        return communityRepository.findAll()
                .stream()
                .map(CommunityManagementUtil::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CommunityDto getCommunityById(Long id) {
        Community c = communityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Community not found"));
        return CommunityManagementUtil.toDto(c);
    }

    @Override
    public CommunityDto updateCommunity(Long id, UpdateCommunityRequest request) {
        Community community = communityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Community not found"));

        community.setName(request.getName());
        community.setLocation(request.getLocation());
        community.setTotalFlats(request.getTotalFlats());

        Community updated = communityRepository.save(community);
        return CommunityManagementUtil.toDto(updated);
    }

    @Override
    public void deleteCommunity(Long id) {
        communityRepository.deleteById(id);
    }
}
