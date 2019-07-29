package com.scottishpower.techexercise.repository;

import com.scottishpower.techexercise.model.SmartRead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * JpaRepository that communicates with the database for the SmartRead table
 */
@Repository
public interface SmartReadRepository extends JpaRepository<SmartRead, Long> {

    Optional<SmartRead> findByAccountNumber(long accountNumber);
}
