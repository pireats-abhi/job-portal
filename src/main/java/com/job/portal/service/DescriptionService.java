package com.job.portal.service;

import com.job.portal.entity.Description;
import com.job.portal.reporsitory.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DescriptionService {

    private final DescriptionRepository descriptionRepository;

    @Autowired
    public DescriptionService(DescriptionRepository descriptionRepository) {
        this.descriptionRepository = descriptionRepository;
    }

    public Description createDescription(Description description) {
        return descriptionRepository.save(description);
    }

    public Description getDescription(long id) {
        Optional<Description> description = descriptionRepository.findById(id);
        return description.orElse(null);
    }

    public List<Description> getAllDescription() {
        Iterable<Description> iterableDescriptions = descriptionRepository.findAll();
        List<Description> descriptions = new ArrayList<>();

        for (Description description: iterableDescriptions) {
            descriptions.add(description);
        }

        return descriptions;
    }

    public Description updateDescription(Description description) {
        return descriptionRepository.save(description);
    }

    public void deleteDescription(long id) {
        descriptionRepository.deleteById(id);
    }
}
