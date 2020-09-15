package com.example.WonderCV.api;

import com.example.WonderCV.domain.Education;
import com.example.WonderCV.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class EducationController {
    @Autowired
    EducationService educationService;

    @GetMapping("/{id}/educations")
    public List<Education> getEduById(@PathVariable long id) {
        return educationService.getEduById(id);
    }
}
