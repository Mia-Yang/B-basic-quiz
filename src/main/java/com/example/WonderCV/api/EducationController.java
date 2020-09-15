package com.example.WonderCV.api;

import com.example.WonderCV.domain.Education;
import com.example.WonderCV.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class EducationController {
    @Autowired
    EducationService educationService;

    @GetMapping("/{id}/educations")
    @ResponseStatus(HttpStatus.OK)
    public List<Education> getEduById(@PathVariable long id) {
        return educationService.getEduById(id);
    }

    @PostMapping("/{id}/educations")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEdu(@PathVariable long id, @RequestBody @Valid Education education) {
        educationService.addEdu(id, education);
    }
}
