package com.table2table.communityservice.repository;


import com.table2table.communityservice.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommunityRepository extends JpaRepository<Community, Long> {

}
