package com.job.portal.reporsitory;

import com.job.portal.entity.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepository extends CrudRepository<Admin, Long> {

    Optional<Admin> findByUserName(String userName);
}
