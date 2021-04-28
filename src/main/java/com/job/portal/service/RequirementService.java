package com.job.portal.service;

import com.job.portal.entity.Requirement;
import com.job.portal.reporsitory.RequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequirementService {

    private final RequirementRepository requirementRepository;

    @Autowired
    public RequirementService(RequirementRepository requirementRepository) {
        this.requirementRepository = requirementRepository;
    }

    public Requirement createRequirement(Requirement requirement) {
        return requirementRepository.save(requirement);
    }

    public Requirement getRequirement(long id) {
        return requirementRepository.findById(id).get();
    }

    public List<Requirement> getAllRequirements() {
        Iterable<Requirement> iterableRequirements = requirementRepository.findAll();
        List<Requirement> requirements = new ArrayList<>();

        for (Requirement requirement: iterableRequirements) {
            requirements.add(requirement);
        }

        return requirements;
    }

    public Requirement updateRequirement(Requirement requirement) {
        return requirementRepository.save(requirement);
    }

    public void deleteRequirement(long id) {
        requirementRepository.deleteById(id);
    }
}
