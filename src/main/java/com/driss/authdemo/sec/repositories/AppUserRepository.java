package com.driss.authdemo.sec.repositories;

import com.driss.authdemo.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {

}
