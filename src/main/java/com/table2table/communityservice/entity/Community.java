package com.table2table.communityservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "communities")
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long communityId;

    private String name;
    private String location;
    private Integer totalFlats;
    private Long pinCode;
    private LocalDateTime createdOn;
    private LocalDateTime lastUpdatedOn;


}
