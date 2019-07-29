package com.scottishpower.techexercise.repository;

import com.scottishpower.techexercise.model.SmartRead;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SmartReadRepository extends JpaRepository<SmartRead, Long> {

    Optional<SmartRead> findByAccountNumber(long accountNumber);
}
