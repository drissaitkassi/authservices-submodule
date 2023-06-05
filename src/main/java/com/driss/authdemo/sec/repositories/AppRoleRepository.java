package com.driss.authdemo.sec.repositories;

import com.driss.authdemo.sec.entities.AppRole;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
}
