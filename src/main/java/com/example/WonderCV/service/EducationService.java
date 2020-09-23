package com.example.WonderCV.service;

import com.example.WonderCV.domain.Education;
import com.example.WonderCV.domain.User;
import com.example.WonderCV.exception.UserNotExistException;
import com.example.WonderCV.repository.EducationRepository;
import com.example.WonderCV.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EducationService {
    private EducationRepository educationRepository;
    private UserRepository userRepository;
    public EducationService(EducationRepository educationRepository, UserRepository userRepository) {
        this.educationRepository = educationRepository;
        this.userRepository = userRepository;
    }

    public List<Education> getEduById(long id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserNotExistException("该用户不存在");
        }
        return user.get().getEducations();
    }

    public void addEdu(long id, Education education) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserNotExistException("该用户不存在");
        }
        education.setUser(user.get());
        educationRepository.save(education);
    }
}
