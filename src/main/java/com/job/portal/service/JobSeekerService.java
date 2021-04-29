package com.job.portal.service;

import com.job.portal.entity.JobSeeker;
import com.job.portal.reporsitory.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobSeekerService {

    private final JobSeekerRepository jobSeekerRepository;

    @Autowired
    public JobSeekerService(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    public JobSeeker createJobSeeker(JobSeeker jobSeeker) {
        return jobSeekerRepository.save(jobSeeker);
    }

    public JobSeeker getJobSeeker(long id) {
        Optional<JobSeeker> jobSeeker = jobSeekerRepository.findById(id);
        return jobSeeker.orElse(null);
    }

    public List<JobSeeker> getAllJobSeekers() {
        Iterable<JobSeeker> iterableJobSeeker = jobSeekerRepository.findAll();
        List<JobSeeker> jobSeekers = new ArrayList<>();

        for (JobSeeker jobSeeker: iterableJobSeeker) {
            jobSeekers.add(jobSeeker);
        }

        return jobSeekers;
    }

    public JobSeeker updateJobSeeker(JobSeeker jobSeeker) {
        return jobSeekerRepository.save(jobSeeker);
    }

    public void deleteJobSeeker(long id) {
        jobSeekerRepository.deleteById(id);
    }
}
