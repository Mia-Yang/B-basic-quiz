package com.example.WonderCV.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;
    @Size(min = 1, max = 128)
    private String name;
    @Min(16)
    private long age;
    @Size(min = 1, max = 512)
    private String avatar;
    @Size(max =1024)
    private String description;
}
