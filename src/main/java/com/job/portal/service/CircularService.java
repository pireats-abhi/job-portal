package com.job.portal.service;

import com.job.portal.entity.Circular;
import com.job.portal.reporsitory.CircularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CircularService {

    private final CircularRepository circularRepository;

    @Autowired
    public CircularService(CircularRepository circularRepository) {
        this.circularRepository = circularRepository;
    }

    public Circular createCircular(Circular circular) {
        return circularRepository.save(circular);
    }

    public Circular getCircular(long id) {
        Optional<Circular> circular = circularRepository.findById(id);
        return circular.orElse(null);
    }

    public List<Circular> getAllCirculars() {
        Iterable<Circular> iterableCirculars = circularRepository.findAll();
        List<Circular> circulars = new ArrayList<>();

        for (Circular circular: iterableCirculars) {
            circulars.add(circular);
        }

        return circulars;
    }

    public Circular updateCircular(Circular circular) {
        return circularRepository.save(circular);
    }

    public void deleteCircular(long id) {
        circularRepository.deleteById(id);
    }
}
