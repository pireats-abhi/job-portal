package com.job.portal.service;

import com.job.portal.entity.Project;
import com.job.portal.reporsitory.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.AttributeOverride;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project getProject(long id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.orElse(null);
    }

    public List<Project> getAllProjects() {
        Iterable<Project> iterableProjects = projectRepository.findAll();
        List<Project> projects = new ArrayList<>();

        for (Project project: iterableProjects) {
            projects.add(project);
        }

        return projects;
    }

    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(long id) {
        projectRepository.deleteById(id);
    }
}
