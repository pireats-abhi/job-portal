package com.job.portal.service;

import com.job.portal.entity.Admin;
import com.job.portal.reporsitory.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin getAdminByUserName(String userName) {
        Optional<Admin> admin = adminRepository.findByUserName(userName);
        return admin.orElse(null);
    }

    public List<Admin> getAllAdmins() {
        Iterable<Admin> iterableAdmins = adminRepository.findAll();
        List<Admin> admins = new ArrayList<>();

        for (Admin admin: iterableAdmins) {
            admins.add(admin);
        }

        return admins;
    }

    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Admin admin) {
        adminRepository.delete(admin);
    }
}
