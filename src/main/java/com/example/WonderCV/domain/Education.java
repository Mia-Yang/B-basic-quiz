package com.example.WonderCV.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private long userId;
    private long year;
    @Size(min = 1, max = 256)
    private String title;
    @Size(min = 1, max = 4096)
    private String description;
}
