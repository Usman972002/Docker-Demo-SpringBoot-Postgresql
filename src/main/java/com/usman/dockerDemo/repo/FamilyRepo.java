package com.usman.dockerDemo.repo;

import com.usman.dockerDemo.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepo extends JpaRepository<Family,Integer> {

}
