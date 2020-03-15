package com.net.data.repositories;

import com.net.common.entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface DestinationRepository extends JpaRepository<Destination,Long> {

    Optional<Destination> findByPoint (String point);
}
