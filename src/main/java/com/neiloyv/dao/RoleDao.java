package com.neiloyv.dao;

import com.neiloyv.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

}
