package com.job.portal.service;

import com.job.portal.entity.Skill;
import com.job.portal.reporsitory.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public Skill getSkill(long id) {
        return skillRepository.findById(id).get();
    }

    public List<Skill> getAllSkills() {
        Iterable<Skill> iterableSkills = skillRepository.findAll();
        List<Skill> skills = new ArrayList<>();

        for (Skill skill: iterableSkills) {
            skills.add(skill);
        }

        return skills;
    }

    public Skill updateSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteSkillById(long id) {
        skillRepository.deleteById(id);
    }
}
