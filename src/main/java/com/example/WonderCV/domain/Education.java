package com.example.WonderCV.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_id", insertable=false, updatable=false)
    private long userId;
    private long year;
    @Size(min = 1, max = 256)
    private String title;
    @Size(min = 1, max = 4096)
    private String description;

    @JsonIgnore
    @ManyToOne
    private User user;
}
