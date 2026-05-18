package com.ems.demo_ems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EMSRepositoryInterface extends JpaRepository<EMSEntity, Long> {
}
