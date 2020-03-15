package com.net.data.repositories;

import com.net.common.entities.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ScenarioRepository extends JpaRepository<Scenario,Long> {
}
