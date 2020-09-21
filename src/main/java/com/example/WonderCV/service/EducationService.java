package com.example.WonderCV.service;

import com.example.WonderCV.domain.Education;
import com.example.WonderCV.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EducationService {
    private EducationRepository educationRepository;
    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getEduById(long id) {
        return educationRepository.getEduById(id);
    }

    public void addEdu(long id, Education education) {
        educationRepository.addEdu(id, education);
    }
}
