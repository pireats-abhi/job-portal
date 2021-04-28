package com.job.portal.service;

import com.job.portal.entity.Education;
import com.job.portal.reporsitory.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EducationService {

    private final EducationRepository educationRepository;

    @Autowired
    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public Education createEducation(Education education) {
        return educationRepository.save(education);
    }

    public Education getEducation(long id) {
        Optional<Education> education = educationRepository.findById(id);
        return education.orElse(null);
    }

    public List<Education> getAllEducations() {
        Iterable<Education> iterableEducations = educationRepository.findAll();
        List<Education> educations = new ArrayList<>();

        for (Education education: iterableEducations) {
            educations.add(education);
        }

        return educations;
    }

    public Education updateEducation(Education education) {
        return educationRepository.save(education);
    }

    public void deleteEducation(long id) {
        educationRepository.deleteById(id);
    }
}
